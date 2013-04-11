@prefix dbpedia: <http://dbpedia.org/ontology/> .

Lexicon(<http://github.com/cunger/lemon.dbpedia/target/dbpedia_en#>,"en",

  // Classes

  ClassNoun("place",dbpedia:Place),
  ClassNoun("location",dbpedia:Place),
  ClassNoun("continent",dbpedia:Continent),
  ClassNoun("country",dbpedia:Country),
  ClassNoun("nation",dbpedia:Country),
  ClassNoun("city",dbpedia:City),
  ClassNoun("town",dbpedia:Town),
  ClassNoun("village",dbpedia:Village),
  ClassNoun(["body"/noun "of"/preposition "water"/noun],dbpedia:BodyOfWater),
  ClassNoun("stream",dbpedia:Stream),
  ClassNoun("river",dbpedia:River),
  ClassNoun("lake",dbpedia:Lake),
  ClassNoun("island",dbpedia:Island),
  ClassNoun("atoll",dbpedia:Atoll),
  ClassNoun("mountain",dbpedia:Mountain),
  ClassNoun(["mountain"/noun "range"/noun],dbpedia:MountainRange),
  ClassNoun(["mountain"/noun "chain"/noun],dbpedia:MountainRange),
  ClassNoun("ridge",dbpedia:MountainRange),
  ClassNoun(["mountain"/noun "pass"/noun],dbpedia:MountainPass),
  ClassNoun("cave",dbpedia:Cave),
  ClassNoun("cavern",dbpedia:Cave),
  ClassNoun("grotto",dbpedia:Cave),
  ClassNoun("canal",dbpedia:Canal),
  ClassNoun("valley",dbpedia:Valley),
  ClassNoun(["world"/noun "heritage"/noun "site"/noun],dbpedia:WorldHeritageSite),
  ClassNoun("park",dbpedia:Park),
  ClassNoun(["ski"/noun "region"/noun],dbpedia:SkiArea),
  ClassNoun(["wine"/noun "region"/noun],dbpedia:WineRegion),
  
  // Properties

  RelationalAdjective("located",dbpedia:country,
    relationalArg=PrepositionalObject("in")),
  RelationalAdjective("located",dbpedia:range,
    relationalArg=PrepositionalObject("in")),
  RelationalAdjective("located",dbpedia:city,
    relationalArg=PrepositionalObject("in")),
  RelationalAdjective("located",dbpedia:location,
    relationalArg=PrepositionalObject("in")),

  RelationalNoun("part",dbpedia:range,
    propObj=PossessiveAdjunct),
    
  StateVerb("cross",dbpedia:crosses),  
  StateVerb("traverse",dbpedia:crosses),
  StateVerb("bridge",dbpedia:crosses),
  StateVerb("span",dbpedia:crosses),
  
  RelationalNoun("crossing",dbpedia:crosses,
    propObj=PossessiveAdjunct),
  RelationalNoun("bridge",dbpedia:crosses,
    propObj=PrepositionalObject("over")),
    
  RelationalNoun("source",dbpedia:source,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
    
  StateVerb("originate",dbpedia:source,
    propObj=PrepositionalObject("in")),
    
  StateVerb("border",dbpedia:border),
  
  RelationalNoun("residence",dbpedia:residence,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
    
  StateVerb("reside",dbpedia:residence,
    propObj=PrepositionalObject("in")),
    
  RelationalNoun(["highest"/adjective "mountain"/noun],dbpedia:highestMountain,
    propObj=PossessiveAdjunct),
  RelationalNoun(["highest"/adjective "mountain"/noun],dbpedia:highestMountain,
    propSubj=Subject,
    propObj=PrepositionalObject("in")),
    
  RelationalNoun("elevation",dbpedia:elevation,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
  RelationalNoun("altitude",dbpedia:elevation,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
  RelationalNoun("height",dbpedia:elevation,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),

  RelationalNoun("population",dbpedia:populationTotal,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),    
  RelationalNoun(["total"/adjective "population"/noun],dbpedia:populationTotal,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
  
  RelationalNoun("area",dbpedia:areaTotal,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
  RelationalNoun(["total"/adjective "area"/noun],dbpedia:areaTotal,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
    
  RelationalNoun(["highest"/adjective "region"/noun],dbpedia:highestRegion,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
    
  RelationalNoun(["postal"/adjective "code"/noun],dbpedia:postalCode,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),
  RelationalNoun(["post"/adjective "code"/noun],dbpedia:postalCode,
    propSubj=PossessiveAdjunct,
    propObj=CopulativeArg),

//  ConsequenceVerb("open",dbpedia:dateUse,
//    propSubj=Subject,
//    propObj=PrepositionalObject("in"))

)


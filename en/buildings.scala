@prefix dbpedia: <http://dbpedia.org/ontology/> .

Lexicon(<http://github.com/cunger/lemon.dbpedia/target/dbpedia_en#>,"en",

  // Classes
  
  ClassNoun("building",dbpedia:Building),
  ClassNoun(["historic"/adjective "building"/noun],dbpedia:HistoricBuilding),
  ClassNoun(["historical"/adjective "building"/noun],dbpedia:HistoricBuilding),
  ClassNoun("stadium",dbpedia:Stadium),
  ClassNoun("arena",dbpedia:Arena),
  ClassNoun("school",dbpedia:School),
  ClassNoun("college",dbpedia:College),
  ClassNoun("bridge",dbpedia:Bridge),
  ClassNoun("university",dbpedia:University),
  ClassNoun(["shopping"/adjective "mall"/noun],dbpedia:ShoppingMall),
  ClassNoun("mall",dbpedia:ShoppingMall),
  ClassNoun(["shopping"/adjective "center"/noun],dbpedia:ShoppingMall),
  ClassNoun("hospital",dbpedia:Hospital),
  ClassNoun("infirmary",dbpedia:Hospital),
  ClassNoun("museum",dbpedia:Museum),
  ClassNoun("station",dbpedia:Station),
  ClassNoun("airport",dbpedia:Airport),
  ClassNoun("road",dbpedia:Road),
  ClassNoun("street",dbpedia:Road),
  ClassNoun("highway",dbpedia:Road),
  ClassNoun("route",dbpedia:Road),
  ClassNoun("hotel",dbpedia:Hotel),
  ClassNoun("restaurant",dbpedia:Restaurant),
  ClassNoun("skyscraper",dbpedia:Skyscraper),
  ClassNoun("monument",dbpedia:Monument),
  ClassNoun("lighthouse",dbpedia:Lighthouse),
  ClassNoun("beacon",dbpedia:Lighthouse),

  // Properties

  RelationalNoun(["structural"/adjective "system"/noun],dbpedia:structuralSystem,
    propSubj=PrepositionalObject("of"),
    propObj=CopulativeArg),

  RelationalAdjective("made",dbpedia:structuralSystem,
    relationalArg=PrepositionalObject("of"))

)




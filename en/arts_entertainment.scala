@prefix dbpedia: <http://dbpedia.org/ontology/> .

Lexicon(<http://github.com/cunger/lemon.dbpedia/target/dbpedia_en#>,"en",

  // Classes
  
  ClassNoun("artist",dbpedia:Artist),
  ClassNoun("work",dbpedia:Work),
  ClassNoun("painting",dbpedia:Painting),
  ClassNoun("sculpture",dbpedia:Sculpture),
  ClassNoun(["musical"/adjective "work"/noun],dbpedia:MusicalWork),
  ClassNoun(["piece"/noun "of"/preposition "work"/noun],dbpedia:MusicalWork),
  ClassNoun("album",dbpedia:Album),
  ClassNoun("LP",dbpedia:Album),
  ClassNoun("single",dbpedia:Single),
  ClassNoun("song",dbpedia:Song),
  ClassNoun("film",dbpedia:Film),
  ClassNoun("movie",dbpedia:Film),
  ClassNoun("actor",dbpedia:Actor),
  ClassNoun("actress",:Actress), 
  ClassNoun(["voice"/noun "actor"/noun],dbpedia:VoiceActor),
  ClassNoun(["voice"/noun "actress"/noun],:VoiceActress),
  ClassNoun("commedian",dbpedia:Commedian),
  ClassNoun("book",dbpedia:Book),
  ClassNoun("writer",dbpedia:Writer),
  ClassNoun("author",dbpedia:Author),
  ClassNoun("musician",dbpedia:MusicalArtist),
  ClassNoun("band",dbpedia:Band),
  ClassNoun("instrument",dbpedia:Instrument),
  ClassNoun(["television"/noun "show"/noun],dbpedia:TelevisionShow),
  ClassNoun(["TV"/noun "show"/noun],dbpedia:TelevisionShow),
  ClassNoun("show",dbpedia:TelevisionShow),
  ClassNoun(["TV"/noun "episode"/noun],dbpedia:TelevisionEpisode),
  ClassNoun("episode",dbpedia:TelevisionEpisode),
  ClassNoun(["radio"/noun "station"/noun],dbpedia:RadioStation),
  ClassNoun(["broadcasting"/noun "station"/noun],dbpedia:RadioStation),
  ClassNoun("broadcast",dbpedia:Broadcast),
  ClassNoun("musical",dbpedia:Musical),
  ClassNoun(["fictional"/adjective "character"/noun],dbpedia:FictionalCharacter),
  ClassNoun(["comics"/noun "character"/noun],dbpedia:ComicsCharacter),
  ClassNoun("character",:Character), 
  ClassNoun("award",dbpedia:Award),
  ClassNoun("prize",dbpedia:Award),
  ClassNoun(["music"/noun "festival"/noun],dbpedia:MusicFestival),
  ClassNoun(["film"/noun "festival"/noun],dbpedia:FilmFestival),
  ClassNoun("festival",:Festival),
  ClassNoun("convention",dbpedia:Convention), 
  ClassNoun(["record"/noun "label"/noun],dbpedia:RecordLabel), 
  ClassNoun("label",dbpedia:RecordLabel), 
  ClassNoun(["music"/noun "genre"/noun],dbpedia:MusicGenre), 
  ClassNoun("genre",dbpedia:MusicGenre), 


  // Properties

  // writer

  RelationalNoun("writer",dbpedia:writer,
               propSubj=PrepositionalObject("of"),
               propObj=CopulativeArg),

  RelationalNoun("author",dbpedia:writer,
               propSubj=PrepositionalObject("of"),
               propObj=Subject),

  StateVerb("write",dbpedia:writer,
               propSubj=DirectObject,
               propObj=Subject),

  // publisher

  RelationalNoun("publisher",dbpedia:publisher,
               propSubj=PrepositionalObject("of"),
               propObj=CopulativeArg),

  StateVerb("publish",dbpedia:publisher,
               propSubj=DirectObject,
               propObj=Subject),

  // starring

  StateVerb("star",dbpedia:starring,
               propSubj=Subject,
               propObj=DirectObject),

  StateVerb("feature",dbpedia:starring,
               propSubj=Subject,
               propObj=DirectObject),

  StateVerb("play",dbpedia:starring,
               propSubj=PrepositionalObject("in"),
               propObj=Subject),

  // instrument 

  RelationalNoun("instrument",dbpedia:instrument,
               propSubj=PrepositionalObject("of"),
               propObj=CopulativeArg),

  StateVerb("play",dbpedia:instrument,
               propSubj=DirectObject,
               propObj=Subject),

  // musicFusionGenre 

  StateVerb("fuse",dbpedia:musicFusionGenre,
               propSubj=PrepositionalObject("into"),
               propObj=Subject),

  // openingFilm 

  RelationalNoun(["opening"/adjective "film"/noun],dbpedia:openingFilm,
               propSubj=PrepositionalObject("at"),
               propObj=CopulativeArg),

  // requirement 

  StateVerb("require",dbpedia:requirement,
               propSubj=DirectObject,
               propObj=Subject),

  RelationalNoun("requirement",dbpedia:requirement,
               propSubj=PrepositionalObject("of"),
               propObj=CopulativeArg),

  // releaseDate 

  RelationalNoun(["release"/noun "date"/noun],dbpedia:releaseDate,
               propSubj=PrepositionalObject("of"),
               propObj=CopulativeArg),

//  ConsequenceVerb("release",dbpedia:releaseDate,
//               propSubj=Subject,
//               propObj=PrepositionalObject("on")),

  StateVerb(["come"/verb "out"/particle],dbpedia:releaseDate,
               propSubj=Subject,
               propObj=PrepositionalObject("on")),

  // award 

  RelationalNoun("award",dbpedia:award,
               propSubj=PossessiveAdjunct,
               propObj=CopulativeArg),

  StateVerb("win",dbpedia:award,
               propSubj=Subject,
               propObj=DirectObject),

  StateVerb("receive",dbpedia:award,
               propSubj=Subject,
               propObj=DirectObject),

//  ConsequenceVerb("award",dbpedia:award,
//               propSubj=Subject,
//               propObj=PrepositionalObject("to"))

)


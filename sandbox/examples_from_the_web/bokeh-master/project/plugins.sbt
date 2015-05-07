addSbtPlugin("com.untyped" % "sbt-js" % "0.7")

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += Resolver.typesafeRepo("releases")

libraryDependencies ++= Seq(
    "io.spray"               %  "spray-can"     % "1.3.0",
    "io.spray"               %  "spray-routing" % "1.3.0",
    "com.typesafe.akka"      %% "akka-actor"    % "2.3.0",
    "com.typesafe.play"      %% "play-json"     % "2.2.2",
    "com.yahoo.platform.yui" %  "yuicompressor" % "2.4.7")

scalacOptions ++= Seq("-Xlint", "-deprecation", "-unchecked", "-feature", "-language:postfixOps")

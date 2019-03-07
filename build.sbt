name := "akka-test-example"

version := "0.1"

scalaVersion := "2.12.8"

resolvers ++= Seq(
  "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
)

libraryDependencies ++= {
  val scalaTestVersion = "3.0.4"
  val spec2Version     = "3.9.5"
  val akkaVersion      = "2.5.21"

  Seq(
    "org.slf4j"             % "slf4j-api"             % "1.7.25",
    "ch.qos.logback"        % "logback-classic"       % "1.2.3",
    "com.typesafe"          % "config"                % "1.3.3",
    "com.typesafe.akka"    %% "akka-slf4j"            % akkaVersion,
    "com.typesafe.akka"    %% "akka-actor"            % akkaVersion,

    // Test Dependencies
    "com.typesafe.akka"    %% "akka-testkit"          % akkaVersion      % Test,
    "org.scalatest"        %% "scalatest"             % scalaTestVersion % Test
  )
}


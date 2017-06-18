name := "hello-slick"

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.7.10",
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

fork in run := true

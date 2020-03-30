name := "helo"
version := "1.0"

val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % "3.1.1" % "test",
    "org.scalacheck" %% "scalacheck" % "1.14.3" % "test"
)

libraryDependencies ++= testDependencies

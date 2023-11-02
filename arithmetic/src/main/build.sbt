libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
lazy val root = (project in file("."))
  .settings(
    name := "arithmetic",
    version := "1.0",
    scalaVersion := "2.12.8"
  )

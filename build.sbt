ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "scala3caliban",
    libraryDependencies += "com.github.ghostdogpr" %% "caliban" % "1.4.0"
)

import Dependencies._

lazy val commonBuildSettings = Seq(
  organization := "com.organization",
  scalaVersion := "2.11.8",
  version      := "0.1.0-SNAPSHOT"
)

lazy val MainProject  = (project in file("."))
  .settings( commonBuildSettings: _* )
  .settings(
    name := "project-name",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= confDeps,
    libraryDependencies ++= logDeps
  ).settings(
    assemblyJarName in assembly := "Main-Project.jar",
    mainClass in assembly := Some("example.Hello")
  )

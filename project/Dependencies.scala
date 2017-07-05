import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  
  lazy val confDeps = {
    val version = "1.3.1"
    Seq(
      "com.typesafe" % "config" % version
    )
  }
  
  lazy val logDeps = {
    val version = "1.2.3"
    Seq(
      "ch.qos.logback" % "logback-classic" % version
    )
  }
}


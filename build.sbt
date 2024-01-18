name := "MyDatabricksUtilities"

version := "0.1"

scalaVersion :="2.12.15"

organization := "com.scala"
val sparkVersion = "3.4.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.3.0-SNAP4" % Test,
  "org.apache.logging.log4j" %% "log4j-api-scala" % "13.0.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.21.1" % Runtime,
  "org.apache.logging.log4j" % "log4j-api" % "2.21.1" % Runtime,
  "com.databricks" %% "dbutils-api" % "0.0.6"
)



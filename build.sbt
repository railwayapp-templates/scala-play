name := """helloworld"""
organization := "com.railwayguide"

version := "1.0-SNAPSHOT"

executableScriptName := "main"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(JavaAppPackaging)

scalaVersion := "2.13.15"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.railwayguide.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.railwayguide.binders._"

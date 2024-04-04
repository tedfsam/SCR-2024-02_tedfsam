
scalaVersion := "2.11.5"

name := "scr-2024-02"
organization := "ru.otus"
version := "1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0"

scalacOptions ++= Seq(
  "-Xexperimental"
)

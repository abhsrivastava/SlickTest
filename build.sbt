name := "SlickTest"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
   "com.typesafe.slick" %% "slick" % "2.1.0"
)

scalacOptions := Seq("-unchecked", "-deprecation", "-verbose", "-Ylog:all", "-Ytyper-debug")
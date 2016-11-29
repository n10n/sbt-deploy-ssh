import bintray.Keys._

sbtPlugin := true

name := "sbt-deploy-ssh"

organization := "com.github.shmishleniy"

version := "0.1.2"

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization in bintray := None

resolvers += "JAnalyse Repository" at "http://www.janalyse.fr/repository/"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.2.1",
  "fr.janalyse" %% "janalyse-ssh" % "0.9.19"
)

libraryDependencies ++= Dependencies.tools

scalacOptions in Compile ++= Seq("-encoding","UTF-8","-target:jvm-1.8","-deprecation","-unchecked","-language:_","-feature")

javacOptions in Compile ++= Seq("-encoding","UTF-8","-source","1.8","-target","1.8")

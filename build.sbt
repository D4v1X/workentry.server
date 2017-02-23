name := """workentry.server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  jdbc,
  ws,
  filters,
  "org.postgresql"         %  "postgresql"               %  "9.4.1209"  withSources() withJavadoc(),
  "org.jooq"               %  "jooq"                     %  "3.9.1"     withSources() withJavadoc(),
  "org.jooq"               %  "jooq-meta"                %  "3.9.1"     withSources() withJavadoc(),
  "org.jooq"               %  "jooq-codegen"             %  "3.9.1"     withSources() withJavadoc(),
  "org.scalatestplus.play" %% "scalatestplus-play"       %  "1.5.1"     % Test
)

// **************************************************
// Task to generate the JOOQ model from the DB tables
// **************************************************

val genJooqModel = taskKey[Seq[File]]("Generate JOOQ classes")

val genJooqTask = Def.task {
  val src = sourceManaged.value
  val cp = (fullClasspath in Compile).value
  val r = (runner in Compile).value
  val s = streams.value

  toError(r.run("org.jooq.util.GenerationTool", cp.files, Array("conf/jooq.xml"), s.log))
  ((src / "main/generated") ** "*.scala").get
}

genJooqModel := genJooqTask.value

unmanagedSourceDirectories in Compile += sourceManaged.value / "main/generated"



// **************************************************************
// Avoid adding the Javadocs when generating a distributable file
// **************************************************************

sources in (Compile, doc) := Seq.empty

publishArtifact in (Compile, packageDoc) := false
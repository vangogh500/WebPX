name := "WebPX"
organization := "vangogh500"
version := "0.1.0-SNAPSHOT"

// scalaJSModuleKind := ModuleKind.CommonJSModule
scalaJSUseMainModuleInitializer := true
enablePlugins(ScalaJSPlugin)

libraryDependencies ++= {
  val akkajs = "1.2.5.11"
  val scalatest = "3.0.5"
  Seq(
    "org.akka-js" %%% "akkajsactor" % akkajs,
    "org.akka-js" %%% "akkajstestkit" % akkajs,
    "org.typelevel" %%% "spire" % "0.14.1"
  )
}

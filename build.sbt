scalaVersion := "2.12.8"

ThisBuild / dependencyOverrides += "org.webjars.npm" % "js-tokens" % "3.0.2"

lazy val orkestra = orkestraProject("orkestra", file("orkestra"))
  .settings(
    libraryDependencies ++= Seq(
      "tech.orkestra" %%% "orkestra-github" % orkestraVersion // Optional Github plugin
      ,"tech.orkestra" %%% "orkestra-cron" % orkestraVersion // Optional Cron plugin
      ,"tech.orkestra" %% "orkestra-lock" % orkestraVersion // Optional Lock plugin
    )
  )
lazy val orkestraJVM = orkestra.jvm
lazy val orkestraJS = orkestra.js
ThisBuild / scalaVersion := "2.13.4"
enablePlugins(ScalaNativePlugin)
libraryDependencies += "dev.zio" %%% "zio" % "1.0.4-2"

nativeConfig ~= { _.withOptimize(false) }

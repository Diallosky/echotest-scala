name := "echotest-scala"

version := "0.2"

scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "com.novocode"   %  "junit-interface" % "0.11"   % Test,  // required only for plain JUnit testing
  "org.scalatest"  %% "scalatest"       % "3.0.1"  % Test,
  "org.scalacheck" %% "scalacheck"      % "1.13.4" % Test
)

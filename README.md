<h1 align="center">
  Strategic Player
</h1>

<div align="center">

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

</div>


Strategic Player is a strategy application designed to run on top of a specific game platform and provide moves autonomously, implementing strategy to provide game results to the end user.  

## Important Notices
* `master` branch file path is the **only** stable branch.

## Usage

Strategic Player has been migrated from Maven to Ant.

Fore more information on Ant, please visit: https://ant.apache.org/

```
ant -p
Buildfile: /strategic-player/build.xml

      Build file for Strategic Developer's implementation of the StrategicPlayer project
  
Main targets:

 checkstyle           generate checkstyle report
 clean                clean up
 compile              compile the source
 cpd                  proccess source with CPD
 dist                 generate the distribution
 doc                  generate the usage documentation
 doc-private          generate the maintenance documentation
 env                  display build parameters
 format               generate formatted versions of source code
 optimize             optimize using proguard
 pmd                  process source with PMD
 report               format junit test results
 run                  run driver
 test                 run junit tests
 testCoverage         run junit tests with JaCoCo instrumentation
 testCoverageReport   format JUnit and JaCoCo test results
 testOptimized        run junit tests using optimized jar
 testOptimizedReport  format junit test results using optimized jar
Default target: all
```

## Authors

* Travis Rebhan
* Douglas Mclaughlin
* Ben LeDoux

# GottaCatchEmAll
An exercise challenge about catching Pokemon in a grid. Each cell of the grid has one Pokemon, with the value of one point. It uses as an input the directions N, S, E and W to move the main character, Ash. The output is the total number of Pokemon that Ash captured in the grid.

## Requirements
* Java 8
* Apache Maven 3.6.0

## Installation
* Apache Maven 3.6.0
```
sudo apt-get install mvn
# if that does not work, try
sudo apt-get install maven
```
## Setup
* To compile the project
```
mvn compile
```
* To create a JAR file
```
mvn package
```
* To run the application
```
 java -cp target/GottaCatchEmAll-1.0-SNAPSHOT.jar org.challenge.Main
```

## Tests
* To run the tests
```
mvn test
```

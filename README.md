# Cubes console program

### About
Console program that requests user input to perform a calculation.
Users are requested to provide center coordinates and edge lengths
for two cubes.
The program outputs whether the cubes intersect and
what is the volume of their intersection.

### Origin
Java 8 compatible draft program with JUnit5 unit tests and Gradle wrapper.
Developed in IntelliJ IDEA.

### Requirements
Java 8 installation is required to interact with the application using command line.

As Gradle wrapper is included, Gradle installation is not required.

### Getting started
1. checkout repository from GitHub
2. build locally, see deployment section
3. run locally, see local execution section

To troubleshoot, it may be helpful to:
- try to compile the project
- run unit tests locally, see testing section

### Deployment
From project root directory, build the application via:
```
gradlew build
```
No repository is configured for publishing built artifacts.

### Testing
From project root directory, run unit tests via:
```
gradlew test
```
Test report is generated within the 
[build directory](build/reports/tests/test/index.html)

### Local execution
From project root directory, interact with the application via console via:
```
gradlew run
```
Console input will be requested from the user several times.

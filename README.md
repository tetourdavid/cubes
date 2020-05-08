# Cubes console program

## About
Java 8 compatible gradle draft program with JUnit5 unit tests.
Written by David Tetour in IntelliJ IDEA.

### Requirements
To interact with the application using command line, Java 8 is required.
Gradle wrapper is included, so Gradle installation should not be mandatory.

### Getting started
1. checkout repository from GitHub
2. build locally, see deployment section
3. run locally, see local execution section

To troubleshoot, it may be helpful to:
- try to compile the project
- run unit tests locally, see testing section

### Deployment
From project root directory, build the application via:
`gradlew build`
Built artifacts aren't published.

### Testing
From project root directory, run unit tests via:
`gradlew test`
Test report will be available at the path bellow, relative to the root directory:
build/reports/tests/test/index.html

### Local execution
From project root directory, interact with the application via console via:
`gradlew run`
Console input will be requested from the user.

jfxtras
=======

A supporting library for JavaFX, containing helper classes, extended layouts, controls and other interesting widgets.


## Project structure:

    Root project 'jfxtras-all'
    +--- Project ':agenda'
    +--- Project ':common'
    +--- Project ':controls'
    +--- Project ':fxml'
    +--- Project ':test-support'
    \--- Project ':window'
    
> **NOTE:** please use `./gradlew projects` to get an up-to-date list of projects


## How to use JFXtras

The easiest way to use JFXtras is by obtaining it via Maven.

### Maven Artifacts:

The `group-id` is `org.jfxtras`, the `artifact-id` depends on the project(s) that shall be used.

### Example

##### Using the Controls Project:

###### Maven:

    <dependency>
      <groupId>org.jfxtras</groupId>
      <artifactId>jfxtras-controls</artifactId>
      <version>8.0-r1-SNAPSHOT</version>
    </dependency>
    
###### Gradle:

    compile group: 'org.jfxtras', name: 'jfxtras-controls', version: '8.0-r1-SNAPSHOT'

## How to Build JFXtras

### Reqirements

- Java >= 1.8
- Internet connection (other dependencies are downloaded automatically)
- IDE: [Gradle](http://www.gradle.org/) Plugin (not necessary for command line usage)

### IDE

Open the `jfxtras` [Gradle](http://www.gradle.org/) project in your favourite IDE (tested with NetBeans 7.4) and build it
by calling the `assemble` task.

### Command Line

Navigate to the [Gradle](http://www.gradle.org/) project (e.g., `path/to/jfxtras`) and enter the following command

#### Bash (Linux/OS X/Cygwin/other Unix-like shell)

    sh gradlew assemble
    
#### Windows (CMD)

    gradlew assemble
    
### How to Compile Subprojects

To compile a subproject, just go to the project folder of the subproject, (e.g., `path/to/jfxtras/controls`) and call the `assemble` task of the subproject.

### How to run Unit Tests

Tu run unit tests call the `test` task of the desired project. To build and test JFXtras at once, the `build` task can be used.

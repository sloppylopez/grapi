------------------------------------------------------------
All tasks runnable from root project
------------------------------------------------------------

Application tasks
-----------------
bootRun - Run the project with support for auto-detecting main class and reloading static resources [classes]
    findMainClass

Build tasks
-----------
assemble - Assembles the outputs of this project. [bootRepackage, war]
bootRepackage - Repackage existing JAR and WAR archives so that they can be executed from the command line using 'java -jar' [war]
    findMainClass
build - Assembles and tests this project. [assemble, check]
buildDependents - Assembles and tests this project and all projects that depend on it. [build]
buildNeeded - Assembles and tests this project and all projects it depends on. [build]
classes - Assembles main classes.
    compileGroovy - Compiles the main Groovy source.
    compileJava - Compiles main Java source.
    processResources - Processes main resources.
clean - Deletes the build directory.
integrationTestClasses - Assembles integration test classes. [classes, testClasses]
    compileIntegrationTestGroovy - Compiles the integrationTest Groovy source.
    compileIntegrationTestJava - Compiles integration test Java source.
    processIntegrationTestResources - Processes integration test resources.
jar - Assembles a jar archive containing the main classes. [classes]
    buildProperties
    compileGsonViews
testClasses - Assembles test classes. [classes]
    compileTestGroovy - Compiles the test Groovy source.
    compileTestJava - Compiles test Java source.
    processTestResources - Processes test resources.
war - Generates a war archive with all the compiled classes, the web-app content and the libraries. [classes]
    buildProperties
    compileGsonViews

Build Setup tasks
-----------------
init - Initializes a new Gradle build. [incubating]

Documentation tasks
-------------------
groovydoc - Generates Groovydoc API documentation for the main source code. [classes]
javadoc - Generates Javadoc API documentation for the main source code. [classes]

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'grapi'.
components - Displays the components produced by root project 'grapi'. [incubating]
dependencies - Displays all dependencies declared in root project 'grapi'.
dependencyInsight - Displays the insight into a specific dependency in root project 'grapi'.
help - Displays a help message.
model - Displays the configuration model of root project 'grapi'. [incubating]
projects - Displays the sub-projects of root project 'grapi'.
properties - Displays the properties of root project 'grapi'.
tasks - Displays the tasks runnable from root project 'grapi'.

IDE tasks
---------
cleanEclipse - Cleans all Eclipse files.
    cleanEclipseClasspath
    cleanEclipseJdt
    cleanEclipseProject
cleanIdea - Cleans IDEA project files (IML, IPR)
    cleanIdeaModule
    cleanIdeaProject
eclipse - Generates all Eclipse files.
    eclipseClasspath - Generates the Eclipse classpath file.
    eclipseJdt - Generates the Eclipse JDT settings file.
    eclipseProject - Generates the Eclipse project file.
idea - Generates IDEA project files (IML, IPR, IWS)
    ideaModule - Generates IDEA module files (IML)
    ideaProject - Generates IDEA project file (IPR)
    ideaWorkspace - Generates an IDEA workspace file (IWS)

Verification tasks
------------------
check - Runs all checks. [classes, integrationTestClasses, test, testClasses]
    integrationTest
test - Runs the unit tests. [classes, testClasses]

Other tasks
-----------
cleanIdeaWorkspace
console [classes]
    findMainClass
dependencyManagement
mergeTestReports
pathingJar [classes]
    buildProperties
    compileGsonViews
pathingJarCommand [classes]
    buildProperties
    compileGsonViews
schemaExport [classes]
    findMainClass
shell [classes]
    findMainClass
urlMappingsReport [classes]
    findMainClass
wrapper

Rules
-----
Pattern: clean<TaskName>: Cleans the output files of a task.
Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

#Grails 3.1.3 Layer for consuming APIS

##Features
    Real time classes recompilation
    Create Domains, Controllers, Interceptors (Plus the test placeholder) with grails command line
    Extreme CoC out-of-the-box

##To run the project
    `grails dev run-app`

##Grails Documentation
    https://grails.github.io/grails-doc/latest/ref/Command%20Line/create-interceptor.html
    https://tedvinke.wordpress.com/2015/08/03/how-to-mock-configuration-in-a-grails-unit-or-integration-test/
    http://www.ociweb.com/resources/publications/sett/september-2015-grails-3-interceptors/
    http://grails.github.io/grails-doc/latest/guide/testing.html

##Pitfalls
    1)In build.gradle we have to use for the project to run...
        profile "org.grails.profiles:rest-api:3.1.2"
    2)It's recomended to use ´sdkman´ to gather all the sdk's we will need (Groovy, Gradle, Grails) to be used in our Intellij IDE


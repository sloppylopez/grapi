#Grails 3.1.3 Layer for consuming APIS

##Features
    Real time classes recompilation
    Create Domains, Controllers, Interceptors (Plus the test placeholder) with grails command line
    Extreme CoC out-of-the-box

##To run the project
    `grails dev run-app`

##Grails Documentation
    https://grails.github.io/grails-doc/latest/ref/Command%20Line/create-interceptor.html

##Pitfalls
    1)In build.gradle we have to use for the project to run...
        profile "org.grails.profiles:rest-api:3.1.2"

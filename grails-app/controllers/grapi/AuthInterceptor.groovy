package grapi

import grails.config.Config
import grails.core.support.GrailsConfigurationAware

class AuthInterceptor implements GrailsConfigurationAware {
//Example non dynamic
//    public AuthInterceptor() {
        // match all requests except requests
        // to the auth controller
    // matchAll().excludes(controller: 'auth')

        // match all requests to the
        // reporting controller...
        // match controller: 'reporting'

        // match all requests to the application
        // or application controller with action ´get´
        //match controller: ~/(application|application)/, action: 'get'
//    }

    boolean before() {
        GroovySystem.println('Before AuthInterceptor Executed')
        // if the user has not been authenticated,
        // redirect to authenticate the user...
        if (false) {
            redirect controller: 'auth', action: 'login'
            return false
        }
        true
    }

    boolean after() {
        GroovySystem.println('After AuthInterceptor Executed')
        true
    }

    void afterView() {
        // no-op
    }
    //Dynamic example
    @Override
    void setConfiguration(Config co) {
        // configure the interceptor matching dynamically
        // based on what is in application.yml
        match co.'grapi.interceptor.application'
    }
}

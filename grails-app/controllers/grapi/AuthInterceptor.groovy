package grapi


class AuthInterceptor implements GrailsConfigurationAware {

    public AuthInterceptor() {
        // match all requests except requests
        // to the auth controller
//        matchAll().excludes(controller: 'auth')
        match controller: 'application'

        // match all requests to the
        // reporting controller...
        // match controller: 'reporting'

        // match all requests to the application
        // or application controller with action ´get´
        //match controller: ~/(application|application)/, action: 'get'
    }

    boolean before() {
        GroovySystem.println('Before AuthInterceptor Executed')
        // if the user has not been authenticated,
        // redirect to authenticate the user...
        if (request) {
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

    @Override
    void setConfiguration(Config co) {
        // configure the interceptor matching dynamically
        // based on what is in application.yml
        match co.'demo.interceptor.first'
    }
}

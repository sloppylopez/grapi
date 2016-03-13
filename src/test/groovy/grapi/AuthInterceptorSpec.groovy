package grapi

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AuthInterceptor)
class AuthInterceptorSpec extends Specification {

    def setup() {

    }

    def cleanup() {

    }

    void "Auth interceptor is called when requesting ApplicationController"() {
        when: "A request is made to the index action"
        withRequest(controller: "application")

        then: "The interceptor does match"
        interceptor.doesMatch()
    }

    void "Test first interceptor not matching"() {
        when: "A request is made to itself and does not intercept it"
        withRequest(controller: "auth")

        then: "The interceptor does not match"
        !interceptor.doesMatch()
    }
}

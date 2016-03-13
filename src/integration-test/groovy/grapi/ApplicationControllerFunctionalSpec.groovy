package grapi

import geb.spock.*
import grails.plugins.rest.client.RestBuilder
import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

import static grails.web.http.HttpHeaders.*
import static org.springframework.http.HttpStatus.*

@Integration
@Rollback
class ApplicationControllerFunctionalSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "Test the status homepage"() {
        when: "The status home page is requested"
        def resp = restBuilder().get("$baseUrl/")

        then: "The status response is correct"
        resp.status == OK.value()
        resp.headers[CONTENT_TYPE] == ['application/json;charset=UTF-8']
        resp.json.message == 'Welcome to Grails!'
    }

    RestBuilder restBuilder() {
        new RestBuilder()
    }
}

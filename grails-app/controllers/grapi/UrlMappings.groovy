package grapi

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'application', action: 'index')
        "/create"(controller: 'application', action: 'create')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}

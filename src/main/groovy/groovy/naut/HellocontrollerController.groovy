package groovy.naut

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus


@Controller("/hellocontroller")
class HellocontrollerController {

    @Get("/")
    def index() {
        return "Hello Micronaut!"
    }
}
package no.johansen.magnus

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class WebService {
    @Autowired
    DB db

    @RequestMapping(method = RequestMethod.GET, value = "create")
    def String createPerson(@RequestParam("name") String name) {
        def person = new Person()
        person.name = name
        db.insert(person)
        return "created person!!!"
    }
}

package no.johansen.magnus

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ui")
public class UI {
    @RequestMapping("magnus")
    def ModelAndView magnus() {
        println "in magnus()....."
        String name = "Magnus Pandalover Johansen"
        return new ModelAndView("magnus/main", "name", name)
    }
}
package org.example;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.websocket.server.PathParam;
import java.awt.print.Pageable;
import java.util.function.Predicate;

@RestController
@Validated
@EnableWebMvc
public class HomeController {

    @GetMapping("/home/{pg}")
    @ResponseBody
    public String getHome(@PathVariable String pg) {
        if (pg.equals("home")) {
            return "this is home page";
        } else if (pg.equals("contact")) {
            return " this is contact page";
        } else if (pg.equals("about")) {
            return "this is about page";
        } else {
            return "try one more time";}
    }

}


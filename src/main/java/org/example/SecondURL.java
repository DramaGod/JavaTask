package org.example;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.websocket.server.PathParam;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;



@RestController
@Validated
@EnableWebMvc
public class SecondURL {

    @GetMapping("/Search")
    @ResponseBody
    public String getHome(@RequestParam String name, String Username) {
        List<String> Person = new ArrayList<>();
        Person.add("Ani Cirekidze");
        Person.add("Nika axmeteli");
        Person.add("Iakob Gogebashvili");
        Person.add("Nini Dvali");
        Integer i=0;

        if(Person.contains(name+" "+Username))
        {
            return (name+" "+Username);
        }
        else
            return "This Person Is Not In Our List";


    }
}


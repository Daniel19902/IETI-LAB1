package eci.edu.ieti.taller.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ControllerGreeting {

    private static final String template = "Hello %s !!";
    private final AtomicLong id = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam( value = "name", defaultValue = "World") String name){
        return new Greeting(id.incrementAndGet(), String.format(template, name));
    }

}

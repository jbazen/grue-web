package com.jahaba.grue;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GrueWebRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/grue-json")
    public Grue grueJson(@RequestParam(value="name", defaultValue="Grue") String name) {
        return new Grue(counter.incrementAndGet(), String.format(template, name));
    }
}

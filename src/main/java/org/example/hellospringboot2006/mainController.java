package org.example.hellospringboot2006;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")  // Para desarrollo
@RequestMapping("/")
class mainController {

    @GetMapping("/")
    public List<String> index() {
        return List.of("Hello World!");
    }

    @GetMapping("/{id}")
    public String byPath(@PathVariable String name) {
        return "Hello World "+name+"!";
    }

    @GetMapping("/params")
    public String byParam(@RequestParam(required = false) String name) {
        if(name!=null)
            return "Hello World "+name+"!";
        else
            return "Hello World!";

    }

    @PostMapping("/post")
    public String byPost(@RequestBody String name) {
        return "Hello Post World "+name+"!";
    }

}

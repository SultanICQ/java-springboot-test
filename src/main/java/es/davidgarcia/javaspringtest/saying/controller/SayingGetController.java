package es.davidgarcia.javaspringtest.saying.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController()
public class SayingGetController {

    @GetMapping("/api/saying")
    public HashMap<String, String> index() {
        HashMap<String, String> status = new HashMap<>();
        status.put("status", "ok");
        return status;
    }
}

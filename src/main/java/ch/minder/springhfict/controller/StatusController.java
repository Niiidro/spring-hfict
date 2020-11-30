package ch.minder.springhfict.controller;

import ch.minder.springhfict.model.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public Status status(@RequestParam(value = "status", defaultValue = "Ok") String status) {
        return new Status(status);
    }
}

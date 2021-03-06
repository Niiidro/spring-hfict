package ch.minder.springhfict.controller;

import ch.minder.springhfict.model.StatusDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<StatusDto> status() {
        return new ResponseEntity<>(new StatusDto(), HttpStatus.OK);
    }
}

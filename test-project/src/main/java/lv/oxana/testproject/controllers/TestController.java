package lv.oxana.testproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String getTest(){
        return "This is Test!";
    }

    @PostMapping(value = "/test")
    public String getAnotherTest(){
        return "This is a response for POST request";
    }
}

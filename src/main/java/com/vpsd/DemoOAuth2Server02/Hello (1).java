package com.vpsd.DemoOAuth2Server02;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vpsd.DemoOAuth2Server02.Model.Welcome;

@RestController
@RequestMapping(
        value = {"/api/hello"},
        produces = MediaType.APPLICATION_JSON_VALUE
)
@Validated
public class Hello {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Welcome greetings(@RequestParam("name") String name) {
        return new Welcome(name);
    }
}

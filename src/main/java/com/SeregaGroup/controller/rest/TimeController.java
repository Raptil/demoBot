package com.SeregaGroup.controller.rest;

import com.SeregaGroup.domain.entity.Time;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/time")
public class TimeController {

    @GetMapping
    public Time getTime (){
        return new Time();
    }
}

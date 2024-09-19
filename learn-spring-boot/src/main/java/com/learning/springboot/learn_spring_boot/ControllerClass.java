package com.learning.springboot.learn_spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerClass {
   @RequestMapping("/courses")
    public List<Courses> coursedetails(){
        return Arrays.asList(
                new Courses( 1 , "JAVA" , "Telusko"),
                new Courses( 2 , "SpringBoot", "in28minutes"),
                new Courses( 3 , "Splunk" , "Splunk Org")
        );
    }

}

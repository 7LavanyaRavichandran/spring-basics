package com.learning.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {
   @Autowired
   private CurrencyConfigurationService currencyConfigurationService;

   @RequestMapping("/currency")
    public CurrencyConfigurationService coursedetails(){
        return currencyConfigurationService;
    }

}

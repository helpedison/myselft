package com.edilabs.myselft.api.rest.controller;

import com.edilabs.myselft.api.rest.model.Data;
import com.edilabs.myselft.api.rest.model.Person;
import com.edilabs.myselft.api.rest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/myself")
public class DataController {


    @Autowired
    DataService dataService ;

    @GetMapping
    public String getDataMyself(){
            return "hola mundo";
    }

    @GetMapping("/person")
    public Person getDatePersonMyself(){
       return dataService.jsonReader();
    }

    @CrossOrigin("https://code.edisonv.dev")
    @GetMapping("/data")
    public Data getDatePortafolioMyself(){
        return dataService.jsonReaderPortafolioData();
    }

}

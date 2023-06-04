package com.edilabs.myselft.api.rest.service.impl;


import com.edilabs.myselft.api.rest.model.Data;
import com.edilabs.myselft.api.rest.model.Person;
import com.edilabs.myselft.api.rest.service.DataService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class DataServiceImpl implements DataService {


    private Person person;

    private Data data;
    public Person jsonReader(){

        ObjectMapper mapper = new ObjectMapper();
        try {

             person = mapper.readValue(new File("src/main/resources/files/person.json"), Person.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return  person;
    }

    public Data jsonReaderPortafolioData(){

        ObjectMapper mapper = new ObjectMapper();
        try {

            data = mapper.readValue(getClass().getResource("/files/portafolioData.json"), Data.class);
            // new File("src/main/resources/files/portafolioData.json")

        } catch (IOException e) {
            e.printStackTrace();
        }

        return  data;
    }




}

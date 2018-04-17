package com.gmail.v.varvaruk89.saveDataFromTheServerREST;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.services.MyJsonParser;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.services.RestClient;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.services.SaveToDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = {"com.gmail.v.varvaruk89.saveDataFromTheServerREST"})

public class SaveDataFromTheServerRestApplication {
    @Autowired
    RestClient restClient;

    @Autowired
    MyJsonParser myJsonParser;

    @Autowired
    SaveToDataBase saveToDataBase;

    public static void main(String[] args) {

        SpringApplication.run(SaveDataFromTheServerRestApplication.class, args);

    }

    @Bean
    String runner() {
        try {

           String url = "https://lb.api-sandbox.openprocurement.org/api/2.4/contracts/ffb2e977797440719208b510ed91548b/documents";
            saveToDataBase.save(url);
            return "";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface SaveToDataBase {

    void save(String url) throws IOException;

}

package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


@Component
public class MyJsonParserImpl implements MyJsonParser {

    @Override
    public GroupMyData getDataFromJson(String json) {
        InputStream targetStream = new ByteArrayInputStream(json.getBytes());
        ObjectMapper objectMapper = new ObjectMapper();
        GroupMyData groupMyData = null;
        try {
            groupMyData = objectMapper.readValue(targetStream, GroupMyData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return groupMyData;
    }
}

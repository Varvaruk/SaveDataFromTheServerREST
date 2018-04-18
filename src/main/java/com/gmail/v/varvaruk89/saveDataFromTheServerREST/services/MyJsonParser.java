package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import org.springframework.stereotype.Service;


@Service
public interface MyJsonParser {

    GroupMyData getDataFromJson(String json);

}

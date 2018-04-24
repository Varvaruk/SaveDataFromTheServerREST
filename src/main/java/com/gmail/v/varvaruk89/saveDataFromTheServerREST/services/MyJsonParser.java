package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;




public interface MyJsonParser {

    GroupMyData getDataFromJson(String json);

}

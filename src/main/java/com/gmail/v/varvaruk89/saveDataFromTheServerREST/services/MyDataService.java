package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;

import java.util.List;


public interface MyDataService {
    List<MyData> findAll();

    void save(MyData myData);

    MyData findById(String id);

}

package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;

import java.util.List;


public interface GroupMyDataService {
    List<GroupMyData> findAll();

    void save(GroupMyData myData);

    GroupMyData findByMyDataId(String idMyData);
}

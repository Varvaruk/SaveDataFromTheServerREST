package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyDataService {
    List<MyData> findAll();
    void save(MyData myData);

}

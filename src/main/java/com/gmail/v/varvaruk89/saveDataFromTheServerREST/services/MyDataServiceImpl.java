package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.repo.MyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MyDataServiceImpl implements MyDataService {

    @Autowired
    private MyDataRepository myDataRepository;

    @Override
    public List<MyData> findAll() {
        return (List<MyData>) myDataRepository.findAll();
    }

    @Override
    public void save(MyData myData) {
        myDataRepository.save(myData);
    }
}

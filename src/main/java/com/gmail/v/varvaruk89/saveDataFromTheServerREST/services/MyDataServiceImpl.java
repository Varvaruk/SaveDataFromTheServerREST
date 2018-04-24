package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.repo.MyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
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

    @Override
    public MyData findById(String id) {
        ArrayList<MyData> myDataArrayList = (ArrayList<MyData>) myDataRepository.findAll();
        for (MyData myData : myDataArrayList) {
            if (myData.getId().equals(id)) {
                return myData;
            }
        }
        return null;
    }


}

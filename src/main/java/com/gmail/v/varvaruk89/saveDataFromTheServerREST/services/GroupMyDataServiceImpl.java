package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.repo.GroupMyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GroupMyDataServiceImpl implements GroupMyDataService {
    @Autowired
    GroupMyDataRepository groupMyDataRepository;

    @Override
    public List<GroupMyData> findAll() {
        return (List<GroupMyData>) groupMyDataRepository.findAll();
    }

    @Override
    public void save(GroupMyData myData) {
        groupMyDataRepository.save(myData);

    }
}

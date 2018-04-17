package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GroupMyDataService {
    List<GroupMyData> findAll();
    void save(GroupMyData myData);
}

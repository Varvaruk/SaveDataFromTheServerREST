package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;

@Service
public class SaveToDataBaseImpl implements SaveToDataBase {

    @Autowired
    RestClient restClient;
    @Autowired
    MyJsonParser myJsonParser;
    @Autowired
    MyDataService myDataService;
    @Autowired
    GroupMyDataService groupMyDataService;

    @Override
    public void save(String url) throws IOException {
        String json = restClient.getJSONFromREST(url);
        GroupMyData groupMyData = myJsonParser.getDataFromJson(json);
        groupMyDataService.save(groupMyData);
        System.out.print(groupMyData.getId());
        List<MyData> myDataList = groupMyData.getData();
        for (MyData m : myDataList) {
            m.setGroupMyData(groupMyData);
            myDataService.save(m);
        }

    }
}

package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaveToDataBaseImplTest {

    @Autowired
    private SaveToDataBase saveToDataBase;

    @Autowired
    private GroupMyDataService groupMyDataService;

    private String url = "https://lb.api-sandbox.openprocurement.org/api/2.4/contracts/ffb2e977797440719208b510ed91548b/documents";


    @Test
    public void testSave() throws IOException {
        saveToDataBase.save(url);
        GroupMyData groupMyData = groupMyDataService.findByMyDataId("abecf7b014574c869a9eef0e9fe0163d");
        assertNotNull(groupMyData);

    }


}
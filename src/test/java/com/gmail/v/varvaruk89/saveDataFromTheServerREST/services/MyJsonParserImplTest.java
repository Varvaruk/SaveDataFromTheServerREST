package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;

import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.GroupMyData;
import com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities.MyData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyJsonParserImplTest {

    @Autowired
    private MyJsonParser myJsonParser;

    private GroupMyData groupMyData;
    private String json = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"hash\": \"md5:70d30a1c3a7c291e8f96bf34708863a8\",\n" +
            "      \"format\": \"application/vnd.openxmlformats-officedocument.wordprocessingml.document\",\n" +
            "      \"url\": \"https://public.docs-sandbox.openprocurement.org/get/a90c899ad7c5456294a619763161eb5b?KeyID=1331dc52&Signature=YTNKJhBhilMY3OjlOl5dJbkcvz8zVUnlq2%2Fk0lt63D8pBL5FzXseMgj6S2EavEXiFQ9VURfa7i4xJaQktqOxCg%253D%253D\",\n" +
            "      \"title\": \"\\u0414\\u043e\\u043a\\u0443\\u043c\\u0435\\u043d\\u0442\\u0430\\u0446\\u0438\\u044f \\u043f\\u043e \\u043b\\u043e\\u0442\\u0443 4.docx\",\n" +
            "      \"documentOf\": \"tender\",\n" +
            "      \"datePublished\": \"2017-09-19T10:13:09.785229+03:00\",\n" +
            "      \"dateModified\": \"2017-09-19T10:13:09.785249+03:00\",\n" +
            "      \"id\": \"abecf7b014574c869a9eef0e9fe0163d\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    @Before
    public void setGroupMyData() throws ParseException {
        groupMyData = new GroupMyData();
        List<MyData> myDataList = new ArrayList<>();
        MyData myData = new MyData();
        myData.setId("abecf7b014574c869a9eef0e9fe0163d");
        myData.setHash("md5:70d30a1c3a7c291e8f96bf34708863a8");
        myData.setFormat("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        myData.setUrl("https://public.docs-sandbox.openprocurement.org/get/a90c899ad7c5456294a619763161eb5b?KeyID=1331dc52&Signature=YTNKJhBhilMY3OjlOl5dJbkcvz8zVUnlq2%2Fk0lt63D8pBL5FzXseMgj6S2EavEXiFQ9VURfa7i4xJaQktqOxCg%253D%253D");
        myData.setTitle("Документация по лоту 4.docx");
        myData.setDocumentOf("tender");
        myData.setDatePublished(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSX").parse("2017-09-19T10:13:09.785229+03:00"));
        myData.setDateModified(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSX").parse("2017-09-19T10:13:09.785249+03:00"));
        myDataList.add(myData);
        groupMyData.setData(myDataList);
    }


    @Test
    public void testGetDataFromJson() {
        assertEquals(myJsonParser.getDataFromJson(json), groupMyData);

    }
}
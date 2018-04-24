package com.gmail.v.varvaruk89.saveDataFromTheServerREST.services;



import java.io.IOException;


public interface RestClient {
    String getJSONFromREST(String url) throws IOException;

}

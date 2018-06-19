package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

public class GoonReader {

    public List<com.company.Currency> getPersons(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<List<com.company.Currency>>(){}.getType());
    }
}

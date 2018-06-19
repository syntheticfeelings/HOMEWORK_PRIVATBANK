package com.company;

import java.util.Currency;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        GoonReader jsonReader = new GoonReader();
        String url = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
        String result = HttpUtil.sendRequest(url, null, null);
        List<com.company.Currency> currencies = jsonReader.getPersons(result);

        for (com.company.Currency currency:currencies){
            System.out.println(currency);
        }
    }
}

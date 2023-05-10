package com.softserve.MyProject;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeService {
    private Exchange exchanger;

    public double getCurrencyRate(String currencyType) {
        if (exchanger == null) {
            try {
                exchanger = getExchanger();
            } catch (IOException e) {
                System.out.println("Помилка: неможливо отримати курс валют на сьогодні. Помилка: " + e.getMessage());
                System.out.println("Вибачте, спробуйте пізніше!");
                System.exit(0);
            }
        }
        return exchanger.currencyList.stream().filter(c -> c.getCc().equals(currencyType)).findFirst().get().getRate();
    }

    private Exchange getExchanger() throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        String response = getResponse(connection);

        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(response, Exchange.class);
    }

    private String getResponse(HttpURLConnection connection) throws IOException {
        try (BufferedReader apiResponse = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = apiResponse.readLine()) != null) {
                response.append(inputLine);
            }

            return response.toString();
        }
    }
}

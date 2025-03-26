package com.cotacoesFinanceiras.cotacoesFinanceiras.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.cotacoesFinanceiras.cotacoesFinanceiras.model.ExchangeRateResponse;

@Service
public class ExchangeRateService {

    private static final String api_url = "https://api.exchangerate-api.com/v4/latest/USD";

    public ExchangeRateResponse ExchangeRate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(api_url, ExchangeRateResponse.class);
    }
}

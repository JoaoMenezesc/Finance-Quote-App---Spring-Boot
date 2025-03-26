package com.cotacoesFinanceiras.cotacoesFinanceiras.controller;

import com.cotacoesFinanceiras.cotacoesFinanceiras.model.ExchangeRateResponse;
import com.cotacoesFinanceiras.cotacoesFinanceiras.service.ExchangeRateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rate")
public class ExchangeRateController {
    private final ExchangeRateService service;

    public ExchangeRateController(ExchangeRateService service) {
        this.service = service;
    }

    @GetMapping
    public ExchangeRateResponse getExchangeRates() {
        return service.ExchangeRate();
    }
}

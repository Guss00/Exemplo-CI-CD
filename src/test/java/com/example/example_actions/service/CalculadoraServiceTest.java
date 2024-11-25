package com.example.example_actions.service;

import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {


    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void testDividirComSucesso() {
        double resultado = calculadoraService.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void testDividirPorZero() {
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            calculadoraService.dividir(10, 0);
        });
        assertEquals("400 BAD_REQUEST \"Divisão por zero não permitida\"", exception.getMessage());
    }

}
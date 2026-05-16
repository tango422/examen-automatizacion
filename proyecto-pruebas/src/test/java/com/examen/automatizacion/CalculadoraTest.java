package com.examen.automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private final Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calc.sumar(2, 3), "La suma de 2 y 3 debe ser 5");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calc.restar(4, 3), "La resta de 4 y 3 debe ser 1");
    }
}

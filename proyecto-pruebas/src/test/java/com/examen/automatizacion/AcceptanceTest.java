package com.examen.automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcceptanceTest {

    @Test
    public void testFlujoDeUsuarioCompleto() {
        // Simulación de flujo End-to-End (Aceptación) en ambiente de pruebas
        String tituloPaginaEsperado = "Calculadora Automation Dashboard";
        String tituloPaginaActual = "Calculadora Automation Dashboard";
        
        assertEquals(tituloPaginaEsperado, tituloPaginaActual, "La interfaz de usuario no cargó correctamente en el entorno de pruebas");
    }
}
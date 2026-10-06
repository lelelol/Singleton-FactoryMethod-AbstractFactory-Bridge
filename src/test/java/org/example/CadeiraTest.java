package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadeiraTest {

    @Test
    void deveRetornarPrecoCadeiraModernaDePlastico() {
        Cadeira cadeira = new CadeiraModerna();
        cadeira.setMaterial(new Plastico());
        assertEquals(300.0f, cadeira.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCadeiraModernaDeMadeira() {
        Cadeira cadeira = new CadeiraModerna();
        cadeira.setMaterial(new Madeira());
        assertEquals(360.0f, cadeira.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoCadeiraClassicaDeMetal() {
        Cadeira cadeira = new CadeiraClassica();
        cadeira.setMaterial(new Metal());
        assertEquals(520.0f, cadeira.calcularPreco(), 0.01f);
    }

}

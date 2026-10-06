package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesaTest {

    @Test
    void deveRetornarPrecoMesaModernaDePlasticoCom4Lugares() {
        Mesa mesa = new MesaModerna();
        mesa.setMaterial(new Plastico());
        assertEquals(800.0f, mesa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoMesaClassicaDeMadeiraCom6Lugares() {
        Mesa mesa = new MesaClassica();
        mesa.setMaterial(new Madeira());
        mesa.setNumLugares(6);
        assertEquals(1800.0f, mesa.calcularPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoMesaModernaDeMetalCom2Lugares() {
        Mesa mesa = new MesaModerna();
        mesa.setMaterial(new Metal());
        mesa.setNumLugares(2);
        assertEquals(520.0f, mesa.calcularPreco(), 0.01f);
    }

}

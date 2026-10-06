package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveDescreverCadeiraModerna() {
        AbstractFactory fabrica = new FabricaModerna();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Cadeira Moderna", cliente.descreverCadeira());
    }

    @Test
    void deveDescreverCadeiraClassica() {
        AbstractFactory fabrica = new FabricaClassica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Cadeira Clássica", cliente.descreverCadeira());
    }

    @Test
    void deveDescreverMesaModerna() {
        AbstractFactory fabrica = new FabricaModerna();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Mesa Moderna", cliente.descreverMesa());
    }

    @Test
    void deveDescreverMesaClassica() {
        AbstractFactory fabrica = new FabricaClassica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Mesa Clássica", cliente.descreverMesa());
    }

    @Test
    void deveCombinarEstiloEMaterialNoPreco() {
        Cliente cliente = new Cliente(new FabricaClassica(), new Madeira());
        assertEquals(480.0f, cliente.precoCadeira(), 0.01f);
        assertEquals(1200.0f, cliente.precoMesa(), 0.01f);
    }

}

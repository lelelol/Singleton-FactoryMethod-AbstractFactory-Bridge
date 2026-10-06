package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(FactoryMethod.getInstance(), FactoryMethod.getInstance());
    }

    @Test
    void deveRetornarFabricaModerna() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("MODERNA");
        assertInstanceOf(FabricaModerna.class, fabrica);
    }

    @Test
    void deveRetornarFabricaClassica() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("CLASSICA");
        assertInstanceOf(FabricaClassica.class, fabrica);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("RUSTICA");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

}

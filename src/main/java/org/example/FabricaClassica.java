package org.example;

public class FabricaClassica implements AbstractFactory {

    @Override
    public Cadeira createCadeira() {
        return new CadeiraClassica();
    }

    @Override
    public Mesa createMesa() {
        return new MesaClassica();
    }
}

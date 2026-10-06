package org.example;

public class FabricaModerna implements AbstractFactory {

    @Override
    public Cadeira createCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Mesa createMesa() {
        return new MesaModerna();
    }
}

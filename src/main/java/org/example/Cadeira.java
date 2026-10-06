package org.example;

public abstract class Cadeira extends Movel {

    public Cadeira(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase * (1 + this.material.percentualAcrescimo());
    }
}

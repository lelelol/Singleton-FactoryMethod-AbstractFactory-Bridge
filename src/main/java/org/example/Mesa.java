package org.example;

public abstract class Mesa extends Movel {

    private int numLugares = 4;

    public Mesa(float precoPorLugar) {
        super(precoPorLugar);
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public float calcularPreco() {
        return this.precoBase * this.numLugares * (1 + this.material.percentualAcrescimo());
    }
}

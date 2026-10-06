package org.example;

public abstract class Movel {

    protected Material material;

    protected float precoBase;

    public Movel(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public abstract String descrever();

    public abstract float calcularPreco();
}

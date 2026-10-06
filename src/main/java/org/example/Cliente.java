package org.example;

public class Cliente {

    private Cadeira cadeira;
    private Mesa mesa;

    public Cliente(AbstractFactory fabrica) {
        this.cadeira = fabrica.createCadeira();
        this.mesa = fabrica.createMesa();
    }

    public Cliente(AbstractFactory fabrica, Material material) {
        this(fabrica);
        this.cadeira.setMaterial(material);
        this.mesa.setMaterial(material);
    }

    public String descreverCadeira() {
        return this.cadeira.descrever();
    }

    public String descreverMesa() {
        return this.mesa.descrever();
    }

    public float precoCadeira() {
        return this.cadeira.calcularPreco();
    }

    public float precoMesa() {
        return this.mesa.calcularPreco();
    }
}

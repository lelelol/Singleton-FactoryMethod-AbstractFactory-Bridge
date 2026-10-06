package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactory fabricaModerna = FactoryMethod.getInstance().getFabrica("MODERNA");
        Cliente clienteModerno = new Cliente(fabricaModerna);
        System.out.println(clienteModerno.descreverCadeira());
        System.out.println(clienteModerno.descreverMesa());

        AbstractFactory fabricaClassica = FactoryMethod.getInstance().getFabrica("CLASSICA");
        Cliente clienteClassico = new Cliente(fabricaClassica);
        System.out.println(clienteClassico.descreverCadeira());
        System.out.println(clienteClassico.descreverMesa());

        System.out.println("Mesma instância do FactoryMethod (Singleton)? "
                + (FactoryMethod.getInstance() == FactoryMethod.getInstance()));

        // Bridge: o mesmo estilo combinado com materiais diferentes
        Cliente clienteMadeira = new Cliente(fabricaModerna, new Madeira());
        System.out.printf("%s de madeira: R$ %.2f%n", clienteMadeira.descreverCadeira(), clienteMadeira.precoCadeira());
        System.out.printf("%s de madeira: R$ %.2f%n", clienteMadeira.descreverMesa(), clienteMadeira.precoMesa());

        Cliente clienteMetal = new Cliente(fabricaClassica, new Metal());
        System.out.printf("%s de metal: R$ %.2f%n", clienteMetal.descreverCadeira(), clienteMetal.precoCadeira());
        System.out.printf("%s de metal: R$ %.2f%n", clienteMetal.descreverMesa(), clienteMetal.precoMesa());
    }
}

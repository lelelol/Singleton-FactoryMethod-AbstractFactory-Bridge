package org.example;

public class FactoryMethod {

    private FactoryMethod() {};
    private static FactoryMethod instance = new FactoryMethod();
    public static FactoryMethod getInstance() {
        return instance;
    }

    public AbstractFactory getFabrica(String estilo) {
        if ("MODERNA".equalsIgnoreCase(estilo)) {
            return new FabricaModerna();
        } else if ("CLASSICA".equalsIgnoreCase(estilo)) {
            return new FabricaClassica();
        } else {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
    }
}

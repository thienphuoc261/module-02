package FactoryMethod;

public class AnimalFactory {
    public static Animal getAnimal(String type){
        if ("dog".equals(type)){
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        }
        return null;
    }
}

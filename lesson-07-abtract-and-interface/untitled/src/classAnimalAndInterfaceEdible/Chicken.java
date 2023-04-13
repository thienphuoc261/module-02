package classAnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String makeSound() {
        return "gâu gâu";
    }

    @Override
    public String howtoEat() {
        return "BBQ";
    }
}

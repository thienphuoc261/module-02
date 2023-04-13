package classAnimalAndInterfaceEdible;

public class Test1 {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for(int index = 0; index < fruits.length; index++){
            System.out.println(fruits[index].howtoEat());
        }

        Chicken chicken = new Chicken();
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howtoEat());

        Tiger tiger = new Tiger();
        System.out.println(tiger.makeSound());
    }
}

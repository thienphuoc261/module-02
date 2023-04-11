package staticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mẹt", "v1");
        System.out.println(Car.count);
        Car car2 = new Car("Lambo","v9");
        System.out.println(Car.count);
    }
}

import Builder.House;
import Builder.HouseBuilder;

public class ClientTest {
    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .buildWalls(4)
                .builDoors(2)
                .buildColors("White")
                .buildPool(true)
                .buildProof(true)
                .build();
        System.out.println(house1);
    }
}

package CandyFactory;

public class CandyFactory {
    public static Candy getCandy(String candyType){
        if ("hard".equals(candyType)){
            return new HardCandy();
        } else if ("mint".equals(candyType)){
            return new MintyCandy();
        }
        return null;
    }
}

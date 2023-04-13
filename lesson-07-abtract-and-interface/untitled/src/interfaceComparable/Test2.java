package interfaceComparable;

import interfaceComparable.ComparableCircle;
import java.util.Arrays;
public class Test2 {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(26.1);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(5.8, "Nâu", true);

        System.out.println("Pre-sort");
        for(ComparableCircle circle: circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After sort");
        for(ComparableCircle circle: circles){
            System.out.println(circle);
        }
    }
}

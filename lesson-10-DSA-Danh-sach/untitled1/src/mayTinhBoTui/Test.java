package mayTinhBoTui;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test a: ");
        MayTinhFX500 mfx500 = new MayTinhFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5 + 3 = " + mfx500.cong(2,3));
        System.out.println("4 * 5 = " + mfx500.nhan(4,5));
    }
}

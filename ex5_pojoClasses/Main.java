import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Country country = new Country("St-pt");
        country.setName("Russia");
        country.setEntryToSea(false);
        country.setPopulations(5_300_000);
        country.setSquareKM(1_439);

        System.out.println("страна: " + country.getName());
        System.out.println("город: " + country.getNameCapital());
        System.out.println("выход к морю: " + country.isEntryToSea());
        System.out.println("численность населения: " + country.getPopulations());
        System.out.println("площадь в км2: " + country.getSquareKM());
    }
}

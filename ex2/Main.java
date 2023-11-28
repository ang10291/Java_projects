
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 12;
        int mishaAge = 119;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        boolean isExclusive = (vasyaAge <= 0 || vasyaAge >= 120) || (katyaAge <= 0 || katyaAge >= 120) || (mishaAge <= 0 || mishaAge >= 120);
        String message = "Ошибка в параметрах, измените возраст от 0 по 120";

        if (isExclusive) {
            System.out.println(message);
        } else {
            if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
                min = katyaAge;
                if (vasyaAge > mishaAge) {
                    max = vasyaAge;
                    middle = mishaAge;
                } else {
                    max = mishaAge;
                    middle = vasyaAge;
                }
            }
            if (vasyaAge <= katyaAge && vasyaAge <= vasyaAge) {
                min = vasyaAge;
                if (katyaAge > mishaAge) {
                    max = katyaAge;
                    middle = mishaAge;
                } else {
                    max = mishaAge;
                    middle = katyaAge;
                }
            }
            if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {
                mishaAge = min;
                if (katyaAge > vasyaAge) {
                    max = katyaAge;
                    middle = vasyaAge;
                } else {
                    max = mishaAge;
                    middle = katyaAge;
                }
            }
            System.out.println("min age: " + min);
            System.out.println("middle age: " + middle);
            System.out.println("max age: " + max);
        
    }
}
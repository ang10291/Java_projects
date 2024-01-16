package NumberAndDateExperiments_08;

public class MoneyCalculator {
    private static final int BANKNOTES_PER_PACK = 100;
    private static final int PACKS_IN_CASSETTE = 20;
    public static void calculateCassetteCount(int banknoteCount) {
        int packCount = banknoteCount / BANKNOTES_PER_PACK + (banknoteCount % BANKNOTES_PER_PACK == 0 ? 0 : 1);
        int cassetteCount = packCount / PACKS_IN_CASSETTE + (packCount % PACKS_IN_CASSETTE == 0 ? 0 : 1);
        if (packCount >= 21) {
            System.out.println("The ATM is full");
        } else System.out.println(cassetteCount + " cassettes has in the ATM");
    }

}

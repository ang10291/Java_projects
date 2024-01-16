package NumberAndDateExperiments_08;

public class MoneyCalculator {
    private static final int BANKNOTES_PER_PACK = 100;
    private static final int PACKS_IN_CASSETTE = 20;
    public static void  calculateCassetteCount(int banknoteCount) {
        int packCount = banknoteCount / BANKNOTES_PER_PACK + (banknoteCount % BANKNOTES_PER_PACK == 0 ? 0 : 1);
        int cassetteCount = packCount / PACKS_IN_CASSETTE + (packCount % PACKS_IN_CASSETTE == 0 ? 0 : 1);
        if (cassetteCount > 10) {
            System.out.println("Этот банкомат заполнен");
        } else System.out.println(cassetteCount);
    }
}

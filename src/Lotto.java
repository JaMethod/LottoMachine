public class Lotto extends LottoGames {

    private static final int NUM_RANGE = 54;

    @Override
    public void generate() {
        System.out.print("\n" + "Your lotto numbers: ");
        generateNumbers(NUM_RANGE);
        generateWildNumber();
    }
}

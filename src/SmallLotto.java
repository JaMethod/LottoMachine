public class SmallLotto extends LottoGames{

    private static final int NUM_RANGE = 52;

    @Override
    public void generate() {
        System.out.print("\n" + "Your small lotto numbers: ");
        generateNumbers(NUM_RANGE);
    }

}

import java.util.ArrayList;
import java.util.Random;

public class LottoGames {

    private static final int WILD_NUM_RANGE = 40;
    private static final int NUM_COUNT = 5;
    private int number;


    private final ArrayList<Integer> randomNumbers = new ArrayList<>(NUM_COUNT);
    private Random random = new Random();

    /**
     * This method generates the game. It is overridden in a subclass.
     */
    public void generate() {
    }

    /**
     * The method generates a wild number.
     */
    public void generateWildNumber() {
        int wildNumber = new Random().nextInt(WILD_NUM_RANGE)+1;
        System.out.println("Your wild number: "+ wildNumber);
    }

    /**
     * The method generates numbers and stores them in the array.
     * @param numRange - the range of possible values.
     */
    public void generateNumbers(int numRange) {
        for (int i = 0; i < NUM_COUNT; i++ ) {
            number = random.nextInt(numRange) + 1;
            check(numRange);
            randomNumbers.add(number);
        }
        print(randomNumbers);
    }

    /**
     * The method checks the generated number uniqueness.
     * @param numRange - the range of possible values.
     */
    private void check(int numRange) {
        for (Integer x : randomNumbers) {

            if (x == number) {
                number = random.nextInt(numRange) + 1;
                check(numRange);
            }
        }
    }

    /**
     * Method prints to the console the contents of the array.
     * @param arr - passed array.
     */
    private void print(ArrayList<Integer> arr) {
        for (Integer i : arr) {
            System.out.print((int) i + " ");
        }
        System.out.println();
    }
}

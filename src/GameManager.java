import java.util.Scanner;

class GameManager {

    private String input;
    private Scanner scanner = new Scanner(System.in);

    /**
     * The method makes a request for input from the user.
     */
    void startGame() {
        System.out.println("What game do you want to play?\n" + "1. Lotto\n" + "2. Small Lotto\n" + "3. Quit");
        input = scanner.next();
        changeGame();
    }

    /**
     * The method determines that the user entered. It creates a new game or exits the program.
     */
    private void changeGame() {
        switch (input) {
            case "1":
                new Lotto().generate();
                break;
            case "2":
                new SmallLotto().generate();
                break;
            case "3":
                System.out.println("Good bye");
                System.exit(0);
                break;
            default:
                startGame();
        }
        continueGame();
    }

    /**
     * The method makes a second request from the user. It is called only after the first game.
     */
    private void continueGame() {
        System.out.println("\n" + "Do you want to play more games or quit?\n" + "1. Lotto\n" + "2. Small Lotto\n" + "3. Quit");
        input = scanner.next();
        changeGame();
    }
}

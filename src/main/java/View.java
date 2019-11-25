public class View {
    public static final String GREETING = "You are welcome in our game! Try to guess the number from a range setted by you!";
    public static final String INPUT_MIN_BORDER = "Input the MINIMAL border of the range!";
    public static final String INPUT_MAX_BORDER = "Input the MAXIMAL border of the range, which is greater on 2 or more than MINIMAL border";
    public static final String WRONG_INPUT_OF_BORDER = "You inputed incorrect value, border shoud be an integer!";
    public static final String WRONG_INPUT_OF_MAX_BORDER = "MAXIMAL border should be an integer, greater on 2 or more than MINIMAL border!!!";
    public static final String CURRENT_RANGE = "Current range is from %d to %d. Try to guess the word!";
    public static final String WRONG_GUESSED_VALUE = "You have to guess the number, so it should be integer. Try again!";
    public static final String CONGRATULATION = "Congratulations, you won the game, the secret number was %d";
    public static final String INPUT_GUESSED_NUMBER = "Input the number you think is the secret";
    public static final String OUT_OF_RANGE = "Your number is out of range! Current range is from %d to %d. Try again!";
    public static final String GREATER = "The secret number is GREATER than yours number. Try again!";
    public static final String LESS = "The secret number is LESS than yours number. Try again!";
    public static final String STAT = "Number of tries: %d. Your previous guesses: %s";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRange(int minBorder, int maxBorder) {
        System.out.println(String.format(CURRENT_RANGE, minBorder, maxBorder));
    }
    public void printOutOfRange(int minBorder, int maxBorder) {
        System.out.println(String.format(OUT_OF_RANGE, minBorder, maxBorder));
    }

    public void printSecretNumber(int secretValue) {
        System.out.println(String.format(CONGRATULATION, secretValue));
    }
    public void printStat(int triesCounter, String tries) {
        System.out.println(String.format(STAT, triesCounter, tries));
    }
}
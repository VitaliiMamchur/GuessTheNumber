import java.util.ArrayList;

public class Model {

    private int minBorder;
    private int maxBorder;
    private int randomValue;
    private int guessedValue;
    private static int triesCounter = 0;
    public ArrayList<Integer> tries = new ArrayList<>();


    public int getMinBorder() {
        return minBorder;
    }

    public void setMinBorder(int minBorder) {
        this.minBorder = minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public void setMaxBorder(int maxBorder) {
        this.maxBorder = maxBorder;
    }

    public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue() {
        this.randomValue = random(this.getMinBorder(), this.getMaxBorder());
    }

    private int random(int minBorder, int maxBorder) {
        int randomValue = (int) Math.ceil(Math.random() * (maxBorder - minBorder - 1) + minBorder);
        return randomValue;
    }

    public int getGuessedValue() {
        return guessedValue;
    }

    public void setGuessedValue(int guessedValue) {
        this.guessedValue = guessedValue;
    }

    public static int getTriesCounter() {
        return triesCounter;
    }

    public static void incrementTriesCounter() {
        triesCounter++;
    }


    /*
    public boolean setRange(int minBorder, int maxBorder) {


        if ((maxBorder - minBorder) >= 2) {
            setMinAndMaxBorders(minBorder, maxBorder);
            return true;
        }

        return false;
    }

    private void setMinAndMaxBorders(int minBorder, int maxBorder) {
        setMinBorder(minBorder);
        setMaxBorder(maxBorder);
    }

     */




}

import java.util.Scanner;

public class Controller {
    Model model = new Model();
    View view = new View();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GREETING);
        inputMinAndMaxBorders(sc);
        model.setRandomValue();
        view.printMessage(View.INPUT_GUESSED_NUMBER);
        while (true) {
            model.setGuessedValue(inputGuessedValueWithScanner(sc));
            Model.incrementTriesCounter();
            model.tries.add(model.getGuessedValue());
            if (checkGuessedValue()) break;

        }

    }

    private boolean checkGuessedValue() {
        if (model.getGuessedValue() < model.getRandomValue()) {
            view.printMessage(View.GREATER);
        }
        else if (model.getGuessedValue() > model.getRandomValue()){
            view.printMessage(View.LESS);
        }
        else {
            view.printSecretNumber(model.getRandomValue());
            view.printStat(model.getTriesCounter(), model.tries.toString());
            return true;
        }
        return false;
    }

    private void inputMinAndMaxBorders(Scanner sc) {

        view.printMessage(View.INPUT_MIN_BORDER);

        model.setMinBorder(isMinBorderInputCorrect(sc));

        view.printMessage(View.INPUT_MAX_BORDER);

        model.setMaxBorder(isMaxBorderInputCorrect(sc));

        view.printRange(model.getMinBorder(), model.getMaxBorder());

    }

    private int isMinBorderInputCorrect(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_OF_BORDER);
            sc.next();
        }
        return sc.nextInt();
    }
    private int isMaxBorderInputCorrect(Scanner sc) {
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_OF_BORDER);
                sc.next();
            }
            Integer maxBorder = sc.nextInt();
            if ((maxBorder - model.getMinBorder()) < 2) {
                view.printMessage(View.WRONG_INPUT_OF_MAX_BORDER);
            }
            else {
                return maxBorder;
            }
        }
    }
    private int inputGuessedValueWithScanner(Scanner sc) {
        int result;
        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_GUESSED_VALUE);
                sc.next();
            }
            result = sc.nextInt();
            if (result <= model.getMinBorder() || result >= model.getMaxBorder()) {
                view.printOutOfRange(model.getMinBorder(), model.getMaxBorder());

                continue;
            }
            break;
        }
        return result;
    }
}

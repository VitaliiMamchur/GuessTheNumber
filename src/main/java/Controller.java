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
        model.setMinBorder(0);
        model.setMaxBorder(2);
        model.setRandomValue();
        System.out.println(model.getRandomValue());
    }
}

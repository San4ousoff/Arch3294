import Classes.Gamer;
import Classes.Knight;
import Classes.PrototypeChar;
import Classes.Wizard;

public class App {
    public static void main(String[] args) throws Exception {
        PrototypeChar prototype1 = new Wizard();
        PrototypeChar prototype2 = new Knight();

        Gamer gamer1 = new Gamer(prototype1);
        gamer1.createAndUsePrototype();

        Gamer gamer2 = new Gamer(prototype2);
        gamer2.createAndUsePrototype();
    }
}

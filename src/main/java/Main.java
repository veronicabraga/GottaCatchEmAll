

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        String directions = input.demandInput();
        Game game = new Game();
        game.moveAsh(directions);
        System.out.println("Ash captured " + game.getPoints() + " Pokemon.");
    }
}

import java.util.Scanner;

public class Input {

    public String demandInput() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Choose a direction or a sequence of directions that Ash should take to capture Pokemon." +
                " \n Insert: N (North), S (South), E (East) or/and W (West)");

        String response = input.nextLine();  // Read user input
        String directions = response.toUpperCase().trim();
        validateInput(directions);
        //System.out.println("The direction(s) chosen is(are): " + directions);
        input.close();
        return directions;
    }

    public void validateInput(String answer) {
        //to-do verification with Regex
        /*boolean match = answer.matches("[NSEW]");
        System.out.println(match);

        if (!match) {
            System.out.println("This input is not valid. Please insert correct options.");
        }*/
        if (!answer.isEmpty()) {
            char[] cardinalPoints = answer.toCharArray();
            //System.out.println(cardinalPoints);

            for (char character : cardinalPoints) {
                if (character != 'N' && character != 'S' && character != 'E' && character != 'W') {
                    System.out.println("This input is not valid. Please insert correct options and without spaces. \n");
                    demandInput();
                    break;
                }
            }
            return;
        }
        System.out.println("Empty answer. Please, choose one or more directions. \n");
        demandInput();

    }
}

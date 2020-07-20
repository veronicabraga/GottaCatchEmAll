import java.util.Scanner;

public class Input {

    public String demandInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a direction or a sequence of directions that Ash should take to capture Pokemon." +
                " \n Insert: N (North), S (South), E (East) or/and W (West)");

        String response = input.nextLine();
        String direction = response.toUpperCase().trim();
        String directions = direction.replaceAll("\\s", "");

        boolean isValid = validateInput(directions);

        while (!isValid) {
            directions = demandInput();
            if (directions != null) {
                isValid = true;
            }
        }

        input.close();
        return directions;
    }

    public boolean validateInput(String answer) {

        if (!answer.isEmpty()) {
            char[] cardinalPoints = answer.toCharArray();

            for (char character : cardinalPoints) {
                if (character != 'N' && character != 'S' && character != 'E' && character != 'W') {
                    System.out.println("This input is not valid. Please insert correct options. \n");
                    return false;
                }
            }
            return true;
        }

        System.out.println("Empty answer. Please, choose one or more directions. \n");
        return false;

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Choose a direction or a sequence of directions that Ash should take to capture Pokemon. \n " +
                "Insert: N (North), S (South), E (East) or/and W (West)");

        String directions = input.nextLine();  // Read user input
        System.out.println("The direction(s) chosen is(are): " + directions);
    }
}

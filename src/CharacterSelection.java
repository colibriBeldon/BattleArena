import java.util.Random;
import java.util.Scanner;

public class CharacterSelection {
    static Boxers choosePlayerCharacter(Scanner scanner, String playerName) {
        while (true) {
            System.out.println("Välj din karaktär:");
            System.out.println("1. Mohamed Ali");
            System.out.println("2. Mike Tyson");
            System.out.println("3. Floyd Mayweather");

            String choice = scanner.nextLine();
            InputValidation inputValidation = new InputValidation();
            if (!inputValidation.isDigit(choice)){
                System.out.println("Du måste välja ett nummer");
                continue;
            }

            if (choice.equals("1")) {
                return new MohamedAli(playerName);
            } else if (choice.equals("2")) {
                return new MikeTyson(playerName);
            } else if (choice.equals("3")){
                return new FloydMayweather(playerName);
            }
            System.out.println("Du måste välja ett nummer mellan 1-3");
        }
    }
    // Flytta
    static Boxers chooseComputerCharacter() {
        Random random = new Random();
        int choice = random.nextInt(3);

        if (choice == 0) {
            return new MohamedAli("Datorn Ali");
        } else if (choice == 1) {
            return new MikeTyson("Datorn Mike");
        } else {
            return new FloydMayweather("Datorn Floyd");
        }
    }
}

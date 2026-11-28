
import java.util.Scanner;

class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName;
        System.out.println("Skriv ditt namn:");
        while (true) {
            InputValidation inputValidation = new InputValidation();
            playerName = scanner.nextLine();
            if (playerName.isEmpty()) {
                System.out.println("Namnet får inte var tomt");
                continue;
            }
            if (inputValidation.isAlpha(playerName)) {
                break;
            }
            System.out.println("Namnet du skrev in är inte giltigt. Får bara innehålla bokstäver");

        }
        // hör ifrån kan vi flytta logiken till Game och andra klasser

        Boxers player = CharacterSelection.choosePlayerCharacter(scanner, playerName);
        Boxers computer = CharacterSelection.chooseComputerCharacter();


        Game game = new Game(player, computer);
        game.start();

        }

    }

    

        // Kan flyttas också


// battle service där attaeran genomförs så det inte blir så mycker på main
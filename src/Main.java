import java.util.Random;
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


        Boxers player = choosePlayerCharacter(scanner, playerName);
        Boxers computer = chooseComputerCharacter();


        while (player.getHp() > 0 && computer.getHp() > 0) {

            Action playerAction = choosePlayerAction(scanner);
            BattleService.performAction(player, computer, playerAction);

            if (computer.getHp() == 0) {
                break;
            }

            Action computerAction = chooseRandomAction();
            BattleService.performAction(computer, player, computerAction);
        }

        if (player.getHp() == 0) {
            System.out.println(computer.getName() + " Vann! ");
        } else {
            System.out.println(player.getName() + " Vann! ");
        }
    }
        static Action chooseRandomAction() {
            Random random = new Random();

            if (random.nextBoolean()) {
                return Action.ATTACK;
            }else{
                return Action.SPECIAL;

            }
        }
        static Action choosePlayerAction(Scanner scanner) {

            while (true) {
                System.out.println("Välj handling:");
                System.out.println("1. Attack");
                System.out.println("2. Specialförmåga");

                String choice = scanner.nextLine().strip();
                InputValidation inputValidation = new InputValidation();
                if (!inputValidation.isDigit(choice)) {
                    continue;
                }
                if (choice.equals("1")) {
                    return Action.ATTACK;
                } else if (choice.equals("2")) {
                    return Action.SPECIAL;
                }
                System.out.println("Du måste välja 1 eller 2.");
            }
        }

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
// ballte service där attaeran genomförs så det inte blir så mycker på main
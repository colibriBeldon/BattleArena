import java.util.Random;
import java.util.Scanner;

class Main {
    static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Skriv ditt namn:");
    String playerName = scanner.nextLine();


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

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                return Action.ATTACK;
            } else if (choice.equals("2")) {
                return Action.SPECIAL;
            } else {
                System.out.println("Ogiltigt val. Skriv 1 eller 2.");
            }
        }

    }
    static Boxers choosePlayerCharacter(Scanner scanner, String playerName) {
        System.out.println("Välj din karaktär:");
        System.out.println("1. Mohamed Ali");
        System.out.println("2. Mike Tyson");
        System.out.println("3. Floyd Mayweather");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            return new MohamedAli(playerName);
        } else if (choice.equals("2")) {
            return new MikeTyson(playerName);
        } else {
            return new FloydMayweather(playerName);
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
import java.util.Random;
import java.util.Scanner;

class Main {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Skriv ditt namn:");
    String playerName = scanner.nextLine();

    static void main(String[] args) {
        MohamedAli ali = new MohamedAli(playerName);
    MikeTyson mike = new MikeTyson("Mike Tyson");
    FloydMayweather floyd = new FloydMayweather("Floyd Mayweather");


    while (ali.getHp() > 0 && mike.getHp() > 0) {

        Action playerAction = choosePlayerAction(scanner);
        performAction(ali, mike, playerAction);

    if (mike.getHp() == 0) {
        break;
    }

        Action computerAction = chooseRandomAction();
        performAction(mike, ali, computerAction);
}

        if (ali.getHp() == 0) {
            System.out.println(mike.getName() + " Vann! ");
        } else {
        System.out.println(ali.getName() + " Vann! ");
        }

    }
    static void printStatus(Boxers first, Boxers second) {
        System.out.println(first.getName() + " HP : " + first.getHp());
        System.out.println(second.getName() + " HP : " + second.getHp());

    }
static void performAttack(Boxers attacker, Boxers defender) {
    int damage = attacker.attack();
    defender.takeDamage(damage);

    System.out.println(
            attacker.getName() + " attackerade " +
                    defender.getName() + " och gjorde " +
                    damage + " skada."
    );

    printStatus(attacker, defender);
}
static void performAction(Boxers actor, Boxers target, Action action) {
    if (action == Action.ATTACK) {
        performAttack(actor, target);
    } else if (action == Action.SPECIAL) {
        actor.specialAbility();
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
        System.out.println("Välj handling:");
        System.out.println("1. Attack");
        System.out.println("2. Specialförmåga");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            return Action.ATTACK;
        } else {
            return Action.SPECIAL;
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
}

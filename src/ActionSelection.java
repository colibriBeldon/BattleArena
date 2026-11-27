import java.util.Random;
import java.util.Scanner;

public class ActionSelection {
public static Action chooseRandomAction(){
    Random random = new Random();
    if (random.nextBoolean()){
        return Action.ATTACK;
    } else {
        return Action.SPECIAL;
    }
}
public static Action choosePlayerAction(Scanner scanner){
    while (true){
        System.out.println("välj handling");
        System.out.println("1. Attack");
        System.out.println("2. Specialförmåga");

        String choise = scanner.nextLine().strip();
        InputValidation inputValidation = new InputValidation();

        if (!inputValidation.isDigit(choise)) {
            System.out.println("Du måste skriva 1 eller 2. ");
            continue;

        }
        if (choise.equals("1")){
            return Action.ATTACK;
        }else if (choise.equals("2")) {
            return Action.SPECIAL;
        }
        System.out.println("Du måste välja 1 eller 2. ");
    }
}
}

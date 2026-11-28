import java.util.Scanner;

public class Game {
    private final Boxers player;
    private final Boxers computer;
    private final Scanner scanner;

    public Game(Boxers player, Boxers computer, Scanner scanner) {
        this.player = player;
        this.computer = computer;
        this.scanner = scanner;
    }
    public void start() {
        while (player.getHp() > 0 && computer.getHp() > 0) {

            Action playerAction =  ActionSelection.choosePlayerAction(scanner);
            BattleService.performAction(player, computer, playerAction);

            if (computer.getHp() == 0) {
                break;
            }
            Action computerAction = ActionSelection.chooseRandomAction();

            BattleService.performAction(computer, player, computerAction
            );
        }
        if (player.getHp() == 0) {
            System.out.println(computer.getName() + " vann!");
        } else {
            System.out.println(player.getName() + " vann!");
        }
     }
}

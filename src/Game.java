public class Game {
    private final Boxers player;
    private final Boxers computer;

    public Game(Boxers player, Boxers computer) {
        this.player = player;
        this.computer = computer;

    }
    public void start() {
        while (player.getHp() > 0 && computer.getHp() > 0) {

            Action playerAction = ActionSelection.choosePlayerAction(new java.util.Scanner(System.in));
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

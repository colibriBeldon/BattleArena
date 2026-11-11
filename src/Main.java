import java.util.Random;
class Main {
static void main(String[] args) {
    MohamedAli ali = new MohamedAli("Muhamed Ali");
    MikeTyson mike = new MikeTyson("Mike Tyson");
    FloydMayweather floyd = new FloydMayweather("Floyd Mayweather");

    while (ali.getHp() > 0 && mike.getHp() > 0) {

        performAction(ali, mike, Action.ATTACK);

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
}

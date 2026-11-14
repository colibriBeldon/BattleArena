public class BattleService {


        public static void performAction(
                Boxers actor,
                Boxers target,
                Action action
        ) {
            if (action == Action.ATTACK) {
                performAttack(actor, target);
            } else if (action == Action.SPECIAL) {
                actor.specialAbility();
            }
        }

        private static void performAttack(
                Boxers attacker,
                Boxers defender
        ) {
            int damage = attacker.attack();
            defender.takeDamage(damage);

            System.out.println(
                    attacker.getName() + " attackerade " +
                            defender.getName() + " och gjorde " +
                            damage + " skada."
            );

            printStatus(attacker, defender);
        }

        private static void printStatus(
                Boxers first,
                Boxers second
        ) {
            System.out.println(
                    first.getName() + " HP: " + first.getHp()
            );
            System.out.println(
                    second.getName() + " HP: " + second.getHp()
            );
        }
    }


/*utföra attacker
utföra specialförmågor
skriva ut resultat
visa HP*/
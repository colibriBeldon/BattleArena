import java.util.Random;

public class MikeTyson extends Boxers{
    private boolean powerPunchReady = false;

        public MikeTyson(String name) {
            super(name);
            setHp(120);

        }
        @Override
        public int attack() {
            Random random = new Random();
            int damage = random.nextInt(12, 21);

            if (powerPunchReady) {
                powerPunchReady = false;
                System.out.println(getName() + " använder sitt kraftslag!");
                return damage * 2;
            }

            return damage;
        }

        @Override
        public void specialAbility() {
            powerPunchReady = true;
            System.out.println(getName() + " laddar sitt kraftslag!");
        }
    }


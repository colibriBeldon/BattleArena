import java.util.Random;

public class MikeTyson extends Boxers{
    private boolean powerPunchReady = false;

    private static final int MIN_DAMAGE = 12;
    private static final int MAX_DAMAGE = 20;
    private static final int START_HP = 120;


    public MikeTyson(String name) {
            super(name, MIN_DAMAGE,MAX_DAMAGE);
            setHp(START_HP);
        }

    @Override
    public int attack() {
        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE, MAX_DAMAGE + 1);

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


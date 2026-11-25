import java.util.Random;

public class FloydMayweather extends Boxers{
    private boolean dodgeReady = false;

    private static final int MIN_DAMAGE = 6;
    private static final int MAX_DAMAGE = 11;
    private static final int START_HP = 100;

public FloydMayweather(String name) {
    super(name,MIN_DAMAGE,MAX_DAMAGE);
    setHp(START_HP);
}


@Override
    public void specialAbility() {
    dodgeReady = true;
    System.out.println(getName() + "är redo att undvika nästa attack!");
}
@Override
    public void takeDamage(int damage) {
    if (dodgeReady) {
        dodgeReady = false;
        System.out.println(getName() + "undvek attacken!");
        return;
    }

    super.takeDamage(damage);
}
}

import java.util.Random;

public class FloydMayweather extends Boxers{
    private boolean dodgeReady = false;

    private static final int FLOYD_MAYWEATHER_MIN_DAMAGE = 6;
    private static final int FLOYD_MAYWEATHER_MAX_DAMAGE = 11;
    private static final int START_HP = 100;

public FloydMayweather(String name) {
    super(name);
    setHp(START_HP);
}

 // slumpmässigt 6 till 10 slag
@Override
    public int attack(){
    Random random = new Random();
    return random.nextInt(FLOYD_MAYWEATHER_MIN_DAMAGE, FLOYD_MAYWEATHER_MAX_DAMAGE);
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

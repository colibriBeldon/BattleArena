import java.util.Random;

public class FloydMayweather extends Boxers{
    private boolean dodgeReady = false;
public FloydMayweather(String name) {
    super(name);
    setHp(100);
}

 // slumpmässigt 6 till 10 slag
@Override
    public int attack(){
    Random random = new Random();
    return random.nextInt(6, 11);
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

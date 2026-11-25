import java.util.Random;

abstract public class Boxers implements Fightable {
    private int hp;
    private String name;
    private Action action;
    private int startHp = 100;
    private final int MIN_DAMAGE;
    private final int MAX_DAMAGE;

    public Boxers( String name, int minDamage, int maxDamage, int startHp) {
        this.hp = this.startHp;
        this.name = name;
        this.action = Action.ATTACK;
        this.MIN_DAMAGE = minDamage;
        this.MAX_DAMAGE = maxDamage;
        this.startHp = startHp;
    }

    @Override
    public void takeDamage(int damage){
        setHp(getHp()-damage);
    }

    public int attack() {
        Random random = new Random();
        return random.nextInt(MIN_DAMAGE, MAX_DAMAGE);
    }

    public void recover(){
        // Ökar hp med ett slumpmässigt värde baserat på nuvarande hp.
        Random r = new Random();
        double hpMultiplication = r.nextDouble(1.4, 2.5);
        int newHp = (int)Math.round(getHp()* hpMultiplication); // type casting

        if (newHp> startHp){
            newHp= startHp;
        }
        this.setHp(newHp);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        // Kan inte bli lägre än 0
        if (hp<0){
            this.hp=0;
        }
    }

    public String getName() {
        return name;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    // attack
    // special ability (abstract)


}

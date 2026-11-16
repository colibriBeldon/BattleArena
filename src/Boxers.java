import java.util.Random;

abstract public class Boxers implements Fightable {
    private int hp;
    private String name;
    private Action action;
    private static final int START_HP = 100;

    public Boxers( String name) {
        this.hp = START_HP;
        this.name = name;
        this.action = Action.ATTACK;
    }

    @Override
    public void takeDamage(int damage){
        setHp(getHp()-damage);
    }

    public void recover(){
        // Ökar hp med ett slumpmässigt värde baserat på nuvarande hp.
        Random r = new Random();
        double hpMultiplication = r.nextDouble(1.4, 2.5);
        int newHp = (int)Math.round(getHp()* hpMultiplication); // type casting

        if (newHp>START_HP){
            newHp=START_HP;
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

abstract public class Boxers implements Fightable {
    private int hp;
    private String name;


    public Boxers( String name) {
        this.hp = 100;
        this.name = name;
    }

    @Override
    public void takeDamage(int damage){
        setHp(getHp()-damage);
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


    // attack
    // special ability (abstract)


}

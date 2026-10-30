abstract public class Boxers implements Fightable {
    private int hp;
    private String name;


    public Boxers(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }


    // attack
    // special ability (abstract)


}

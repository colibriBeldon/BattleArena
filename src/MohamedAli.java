import java.util.Random;
public class MohamedAli extends Boxers{
    private boolean noDamage = false;

    private static final int MOHAMMED_ALI_MIN_DAMAGE = 8;
    private static final int MOHAMMED_ALI_MAX_DAMAGE = 12;
    private static final int START_HP = 110;
    public MohamedAli( String name) {
        super(name);
        this.setHp(START_HP);
    }
    // en funktion för att dra av damage

    @Override // Polymorphism
    public void takeDamage(int damage){
        Random r = new Random();
        if (noDamage){
            noDamage= false;
            System.out.println(this.getName() +  " tog ingen skada");
            return;
        }
        // Dra av damage från hp
        super.setHp(getHp()-damage);
    }

    // Fightabel (Abstract)
    @Override
    public int attack (){
        Random r = new Random();
        int damage = r.nextInt(MOHAMMED_ALI_MIN_DAMAGE,MOHAMMED_ALI_MAX_DAMAGE);// slumpmässig mellan 8-12
        return damage;
    }
    @Override
    public void specialAbility(){
        Random r = new Random();
        if (r.nextBoolean()){
            noDamage= true;
        }
    }


/*### Ali – snabbhet

- **HP:** 100
- **Vanlig attack – Snabb jabb:** gör slumpmässigt 8–12 skada.
- **Specialförmåga – Fotarbete:** nästa attack mot Ali har 50 % chans att missa.

}*/




}

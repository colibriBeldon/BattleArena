import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxersTest {
    Boxers boxer = new MikeTyson("player");

    @Test
    void takeDamage() {
        int startHp = boxer.getHp();
        boxer.takeDamage(10);
        int endHp = boxer.getHp();
        assertEquals(startHp - 10, endHp);
    }
    @Test
    void hpCannotBeNegative() {
        boxer.takeDamage(Integer.MAX_VALUE);
        assertEquals(0, boxer.getHp());
    }

    @Test
    void attackDamageIsRandom(){
        boolean isRandom =false;
        int firstAttack = boxer.attack();
        for (int i = 0; i < 100; i++){
            int secondAttack = boxer.attack();
            if (firstAttack != secondAttack){
                isRandom = true;
                break;
            }
        }
        assertTrue(isRandom);
    }
    @Test
    void recover(){
        boxer.takeDamage(10);
        int startHp = boxer.getHp();
        boxer.recover();
        int endHp = boxer.getHp();
        assertTrue(startHp < endHp);
    }
}
import java.util.ArrayList;
import java.util.Random;

class Main {
    static void main(String[] args) {

        ArrayList<Boxers> players= new ArrayList<>();

        players.add(new MohamedAli("Gabbe"));
        players.add( new MikeTyson("Sem"));
        boolean gameOver = false;
        while (!gameOver){

            int givenDamage=0;
            for (Boxers player: players){
                player.takeDamage(givenDamage);
                int playerChoice = randomPlayerChoice();
                givenDamage = playerAction(player, playerChoice);

                if (player.getHp()==0){
                    gameOver=true;
                    System.out.println(player.getName() + " Förlorade");
                }
            }


        }


    }

    static int randomPlayerChoice(){
        Random r = new Random();
        return r.nextInt(1, 3);
    }

    static int playerAction(Boxers player, int choice){
        int damage =0;
        switch (choice){
            case 1:
                damage=player.attack();
                System.out.println(player.getName() + " attackerade");
            case 2:
                player.specialAbility();
                System.out.println(player.getName() + " valde speciall abiltiy");
        }
        return damage;
    }
}
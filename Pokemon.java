import java.io.*;
import java.lang.Math;
import java.util.Ramdom;


public class Pokemon {
            private String pName ;
            private  int health;
            private  int exp = 0;
            private  int level;
            private  int attack;
            private  int startHealth = 10;
            private  int startATK = 2;
            private  int startDEF = 3;
            private  int def ;
            private  int levelUpExp;

        public Random (){
            int hpRandom ;
            int atkRandom ;
            int defRandom;
            hpRandom = 3 + (int) (Math.random() * (3)) ; // random 3-5
            atkRandom = 4 + (int) (Math.random() * (4)) ; // random 4-7
            defRandom = 5 + (int) (Math.random() * (6)) ; // random 5-10
        }    

        public Pokemon (String name) {
            Random Rand1 = new Random() ;

            name = pName ;
            level = 1 ;
            levelUpExp = 10 ;
            health = startHealth * Rand1.hpRandom ;
            attack = startATK * Rand1.atkRandom ;
            def = startDEF * Rand1.defRandom ;

         }
         public void showStatus() {

             System.out.println("Name :" +name);
             System.out.println("level :" +level);
             System.out.println("HP :" +health);
             System.out.println("DEF :" +def);

         }
         public void getExp(int xp){
                exp += xp ;
                    if(exp >= levelUpExp){
                        exp = exp - levelUpExp ;
                    }
         }
         public void levelUp (){
             level++ ;
             levelUpExp += 5 ;
             statusUp() ;
             
         }

    }
            
        
    


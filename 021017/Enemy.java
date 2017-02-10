
/**
 * Abstract class Enemy - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Enemy{
   int hitpoints;
   public Enemy(int hp){
       hitpoints = hp;
    }
   public void takeDamage(int dmg){
           hitpoints -= dmg; // hitpoints = hitpoints - dmg
        }
   public int getHitpoints(){
       return hitpoints;
    }
           
  
}

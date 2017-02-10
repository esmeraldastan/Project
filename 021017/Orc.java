
/**
 * Write a description of class Orc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orc extends Enemy{
   int damage;
   public Orc(int hp, int dmg){
       super(hp);
       damage = dmg;
    }
   public void takeDamage(int dmg){
       System.out.println("The orc goes 'OW'");
       super.takeDamage(dmg);
    }
    public void attack(Enemy target){
        target.takeDamage(damage);
    }
}

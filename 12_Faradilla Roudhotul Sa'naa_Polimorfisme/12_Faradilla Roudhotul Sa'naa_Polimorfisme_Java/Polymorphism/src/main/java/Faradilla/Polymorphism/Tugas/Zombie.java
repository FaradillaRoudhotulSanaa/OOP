package Faradilla.Polymorphism.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public abstract class Zombie {
    protected int health, level;
    public abstract void heal();
    public abstract void destroyed();
    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level; 
    }
}

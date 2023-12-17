package Faradilla.Polymorphism.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class WalkingZombie extends Zombie implements Destroyable {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (health * 0.2);
        } else if (level == 2) {
            health += (int) (health * 0.3);
        } else if (level == 3) {
            health += (int) (health * 0.4);
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.2;
    }

    @Override
    public String getZombieInfo() {
        System.out.println("Walking Zombie Data");
        return super.getZombieInfo();
    }
}


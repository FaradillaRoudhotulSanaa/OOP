package Faradilla.Polymorphism.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class JumpingZombie extends Zombie implements Destroyable {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += (int) (health * 0.3);
        } else if (level == 2) {
            health += (int) (health * 0.4);
        } else if (level == 3) {
            health += (int) (health * 0.5);
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.15);
    }

    @Override
    public String getZombieInfo() {
        System.out.println("Jumping Zombie Data");
        return super.getZombieInfo();
    }
}


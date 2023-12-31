package Faradilla.Polymorphism.Tugas;
/**
 *
 * @author Faradilla R Sa'naa
 */
public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public void destroyed() {
        strength -= strength * 0.1;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}

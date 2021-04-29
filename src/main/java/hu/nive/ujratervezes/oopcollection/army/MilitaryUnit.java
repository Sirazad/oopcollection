package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private int damage;
    private boolean isArmoured;

    MilitaryUnit(int hitPoints, int damage, boolean isArmoured){
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.isArmoured = isArmoured;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int doDamage() {
        return this.damage;
    }
    public void sufferDamage(int damage){
        int damageCaused = (isArmoured) ? damage / 2 : damage;
        this.hitPoints -= damageCaused;
    }
}

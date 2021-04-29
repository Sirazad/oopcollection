package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield = true;

    Swordsman(boolean isArmoured) {
        super(100, 10, isArmoured);
    }

    @Override
    public void sufferDamage(int damage){
        if (hasShield) {
            damage = 0;
            hasShield = false;
        }
        super.sufferDamage(damage);
    }


}
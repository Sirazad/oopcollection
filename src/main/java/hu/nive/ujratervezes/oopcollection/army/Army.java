package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
            if (unit.getHitPoints() <= 25) army.remove(unit);
        }
    }

    public int getArmyDamage() {
        return army.stream().mapToInt(unit -> unit.doDamage()).reduce(0, Integer::sum);
    }

    public int getArmySize() {
        return army.size();
    }
}
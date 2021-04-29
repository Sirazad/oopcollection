package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> casualties = new ArrayList<>();
        for (int i = 0; i < army.size(); i++) {
            MilitaryUnit unit = army.get(i);
            unit.sufferDamage(damage);
            if (unit.getHitPoints() <= 25) casualties.add(unit);
        }
        army.removeAll(casualties);
    }

    public int getArmyDamage() {
        return army.stream().mapToInt(unit -> unit.doDamage()).reduce(0, Integer::sum);
    }

    public int getArmySize() {
        return army.size();
    }
}
package Wepons;

import Wepons.WeaponStatRandom.BowStatR;
import Wepons.WeaponStatRandom.SwordStatR;

public class CreationWeapon {

    public Bow getBow() {
        BowStatR bowStat = new BowStatR();
        int damage = bowStat.damage();
        String tipe = bowStat.tipe();
        return new Bow(damage, tipe);
    }

    public Sword getSword() {
        SwordStatR swordStat = new SwordStatR();
        int damage = swordStat.damage();
        String tipe = swordStat.tipe();
        return new Sword(damage, tipe);
    }
}

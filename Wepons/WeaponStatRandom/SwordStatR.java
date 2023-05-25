package Wepons.WeaponStatRandom;

import java.util.Random;

public class SwordStatR implements WStatRandom {

    @Override
    public int damage() {
        Random random = new Random();
        int i = random.nextInt(10, 50);
        return i;
    }

    @Override
    public String tipe() {
        return "sword";
    }
    
}

package Wepons.WeaponStatRandom;

import java.util.Random;

public class BowStatR implements WStatRandom{

    @Override
    public int damage() {
        Random random = new Random();
        int i = random.nextInt(30, 100);
        return i;
    }

    @Override
    public String tipe() {
        return "bow";
    }
    
}

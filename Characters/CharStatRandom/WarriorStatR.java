package Characters.CharStatRandom;

import java.util.Random;

public class WarriorStatR implements CStatRandom {

    @Override
    public int health() {
        Random random = new Random();
        int i = random.nextInt(150, 200);
        return i;
    }

    @Override
    public int armor() {
        Random random = new Random();
        int i = random.nextInt(75, 100);
        return i;
    }
    
}

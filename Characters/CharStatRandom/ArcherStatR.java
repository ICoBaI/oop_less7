package Characters.CharStatRandom;

import java.util.Random;

public class ArcherStatR implements CStatRandom {

    @Override
    public int health() {
        Random random = new Random();
        int i = random.nextInt(100, 150);
        return i;
    }

    @Override
    public int armor() {
        Random random = new Random();
        int i = random.nextInt(50, 75);
        return i;
    }
    
}

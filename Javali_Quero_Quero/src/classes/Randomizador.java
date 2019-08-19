package classes;

import java.util.Random;

public class Randomizador {

    private static final int SEED = 1111;
    private static final Random RAND = new Random(SEED); // quando se coloca o final, quer dizer que � imut�vel, ou
    // seja, n�o pode ser alterado.
    private static final boolean USESHARED = true;

    public static Random getRandom() {
        if (USESHARED) {
            return RAND;
        } else {
            return new Random();
        }
    }

    public static void reset() {
        if (USESHARED) {
            RAND.setSeed(SEED);
        }
    }
}

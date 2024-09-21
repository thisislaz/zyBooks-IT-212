package weekone;

import java.util.Random;

public class ThreeRandomValues {
    public static void main(String[] args) {
        Random rand = new Random();
        double y = Math.pow(2.0, 8.0);
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextInt(5));
        System.out.println(y);
    }

    /*
    Generate a random integer from 5 to 17

    randGen.nextInt(max - min + 1) + min;

    Expected: randGen.nextInt(13) + 5.  The passed number is the range size, so 17 - 5 + 1 = 13,
    which yields 0 to 12. That range is shifted by 5 to yield 5 to 17.

     */
}
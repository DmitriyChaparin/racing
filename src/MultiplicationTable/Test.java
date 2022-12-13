package MultiplicationTable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {

        Set<Example> examples = new HashSet<>();

        while (examples.size() < 15) {
            int randomInt = ThreadLocalRandom.current().nextInt(1, 10);
            int randomInt2 = ThreadLocalRandom.current().nextInt(1, 10);
            Example example = new Example(randomInt,randomInt2 );
            examples.add(example);
            System.out.println(example);
        }
    }
}

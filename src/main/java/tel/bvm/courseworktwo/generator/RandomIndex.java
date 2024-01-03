package tel.bvm.courseworktwo.generator;

import org.springframework.stereotype.Component;

@Component
public class RandomIndex {
    public static int getRandomGenerator(int maxValue) {
        java.util.Random random = new java.util.Random();
        int minValue = 1;
        return random.nextInt((maxValue - minValue) + 1);
    }
}

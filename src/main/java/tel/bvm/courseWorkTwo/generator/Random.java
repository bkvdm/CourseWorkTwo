package tel.bvm.courseWorkTwo.generator;

import org.springframework.stereotype.Component;

@Component
public class Random {
    public int getRandomGenerator(int maxValue) {
        java.util.Random random = new java.util.Random();
        int minValue = 1;
        return random.nextInt((maxValue - minValue) + 1);
    }
}

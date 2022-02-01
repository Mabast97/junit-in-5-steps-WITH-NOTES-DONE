package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    // The rest of the (assert) methods and @Annotations, search for it .

    MyMath myMath = new MyMath();

    @Test
    void sum_with3numbers() {
        int result = myMath.sum(new int[] {1,2,3});

        assertEquals(6, result); // It means that we expect the result will be (6).
    }

    @Test
    void sum_with1number() {
        int result = myMath.sum(new int[] {3});

        assertEquals(4, result); // It means that we expect the result will be (6).
    }
}
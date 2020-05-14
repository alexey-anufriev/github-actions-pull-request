package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    public void shouldAddTwoNumbers() {
        Assertions.assertEquals(2, new Calc().sum(-1, 3));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        Assertions.assertEquals(-2, new Calc().subtract(3, 5));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        Assertions.assertEquals(10, new Calc().mul(2, 5));
    }

}

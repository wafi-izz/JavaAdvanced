package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @Test
    void testsubtraction1() {
        MathOperation mathOperation = new MathOperation();
        int operation = mathOperation.subtraction(4,5);
        Assertions.assertEquals(-1,operation,"assertions failed, expected -1 but got " + operation);
    }
    @Test
    void testsubtraction2() {
        MathOperation mathOperation = new MathOperation();
        int operation = mathOperation.subtraction(-5,-5);
        Assertions.assertEquals(0,operation,"assertions failed, expected 0 but got " + operation);
    }

    @Test
    void testmultiplication1() {
        MathOperation mathOperation = new MathOperation();
        int operation = mathOperation.multiplication(10,10);
        Assertions.assertEquals(100,operation,"assertions failed, expected 100 but got " + operation);
    }
    @Test
    void testmultiplication2() {
        MathOperation mathOperation = new MathOperation();
        int operation = mathOperation.multiplication(-1,-1);
        Assertions.assertEquals(1,operation,"assertions failed, expected 1 but got " + operation);
    }
}
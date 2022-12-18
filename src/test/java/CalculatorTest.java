package src.test;

import org.junit.Test;
import junit.frameworrk.Assert;

class CalculatorTest {

    @Test
    void add() {
        Assert.assertTrue(Calculator.add(2,5) == 7);
    }

    @Test
    void dif() {
       Assert.assertTrue(Calculator.dif(10,2) == 8);
    }

    @Test
    void div() {
        Assert.assertTrue(Calculator.div(10,2) == 5);
    }

    @Test
    void times() {
        Assert.assertTrue(Calculator.times(10,2) == 20);
    }

    @Test
    void solver() {
        Assert.assertTrue(Calculator.solver(5, -10) == 2);
    }
}
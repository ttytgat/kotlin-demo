package be.continuum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void sum() {
        int sum = Calculator.sum(2, 3);
        assertThat(sum, equalTo(5));
    }

    @Test
    public void minOverloadedWithNoParameter() {
        int min = Calculator.min();
        assertThat(min, equalTo(1));
    }

    @Test
    public void minOverloadedWithOneParameter() {
        int min = Calculator.min(5);
        assertThat(min, equalTo(2));
    }

    @Test
    public void minOverloadedWithTwoParameter() {
        int min = Calculator.min(9, 4);
        assertThat(min, equalTo(5));
    }

}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Nikoloz on 05/08/16.
 */
public class ArithmeticsTest {

    Arithmetics arithmetics;

    @Before
    public void setup() {
        AdvancedCalculator calc = mock(AdvancedCalculator.class);
        when(calc.remainder(10, 3)).thenReturn(1);
        arithmetics = new Arithmetics(calc);
    }

    @Test
    public void testAddition() {
        assertEquals(5, arithmetics.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(-1, arithmetics.subtract(2, 3));
    }

    @Test
    public void testMult() {
        assertEquals(6, arithmetics.multiply(2, 3));
    }

    @Test
    public void testDiv() {
        assertEquals(2, arithmetics.divide(10, 5));
    }

    @Test
    public void testRemainderWithMockito() {
        assertEquals(1, arithmetics.remainder(10, 3));
    }
}

package op;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {

    @Test
    public void testSub() {
        Operations o = new Operations();
        assertEquals(-1, o.sub());
        o.setX(1);
        assertEquals(1, o.sub());
    }

    @Test
    public void testMult() {
        Operations o = new Operations();
        assertEquals(6, o.mult());
    }
}

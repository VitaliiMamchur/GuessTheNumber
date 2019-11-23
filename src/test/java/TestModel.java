
import org.junit.Test;

import static org.junit.Assert.*;

public class TestModel {

    @Test
    public void testSetRange() {
        Model model = new Model();
        assertTrue(model.setRange(1, 5));
        assertFalse(model.setRange(1, 2));
        assertFalse(model.setRange(5, 1));
    }

}
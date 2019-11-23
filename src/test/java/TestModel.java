
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestModel {

    Model model;
    
    @Before
    public void createModel(){
        model = new Model();
    }

    @Test
    public void testSetRange() {
        assertTrue(model.setRange(1, 5));
        assertFalse(model.setRange(1, 2));
        assertFalse(model.setRange(5, 1));
    }

    @Test
    public void TestSetRandomValue() {
        int i = 0;
        model.setRange(0, 100);
        while (i < 10000) {
            model.setRandomValue();
            int rand = model.getRandomValue();
            assertTrue(rand > model.getMinBorder() && rand < model.getMaxBorder());
            i++;
        }

    }


}
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class WhateverTest {

    private Whatever whatever = new Whatever();

    @Ignore
    @Test
    public void returnWhatReturnsInput() {
        // Arrange
        String what = "what";

        //Act
        String result = whatever.returnWhat(what, true);

        //Assert
        assertEquals(what, result);
    }

    @Ignore
    @Test
    public void returnWhatReturnsInput2() {
        // Arrange
        String what = "what";

        //Act
        String result = whatever.returnWhat(what, false);

        //Assert
        assertEquals("nothing", result);
    }
}
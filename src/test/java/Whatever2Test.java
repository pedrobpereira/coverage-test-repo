import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class Whatever2Test {

    private Whatever2 whatever = new Whatever2();

    @Test
    public void returnWhatReturnsInput() {
        // Arrange
        String what = "what";

        //Act
        String result = whatever.returnWhat(what, true);

        //Assert
        assertEquals(what, result);
    }

    @Test
    public void returnNothingReturnsInput() {
        // Arrange
        String what = "what";

        //Act
        String result = whatever.returnWhat(what, false);

        //Assert
        assertEquals("nothing", result);
    }
}
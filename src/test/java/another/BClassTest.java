package another;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BClassTest {

    private BClass whatever = new BClass();

    @Test
    public void returnWhatReturnsInput() {
        // Arrange
        String what = "what";

        //Act
        String result = whatever.returnWhat(what, true);

        //Assert
        assertEquals(what, result);
    }


}
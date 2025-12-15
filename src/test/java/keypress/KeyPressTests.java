package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressTests extends BaseTests {

    @Test
    public void testKeyPress(){
        var keyPressPage = homePage.clickKeyPressLink();
        keyPressPage.setText("a" + Keys.BACK_SPACE);
        assertEquals(keyPressPage.resultMessage(), "You entered: BACK_SPACE", "Result Message Incorrect");
    }

}

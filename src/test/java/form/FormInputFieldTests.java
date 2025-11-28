package form;

import base.BaseTests;
import org.testng.annotations.Test;

public class FormInputFieldTests extends BaseTests {


    @Test
    public void testForm(){
       var formPage = homePage.clickInputformSubmitLink();
       formPage.setValuesToFields();

    }
}

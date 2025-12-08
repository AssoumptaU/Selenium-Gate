package wait;

import base.BaseTests;
import org.testng.annotations.Test;

public class DynamicDataLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoading(){
        var dynamicDataLoadingPage = homePage.clickDynamicDataLoadingLink();
        var dataLoadedPage = dynamicDataLoadingPage.getRandomUser();
        dataLoadedPage.userLoadedPage();
    }
}

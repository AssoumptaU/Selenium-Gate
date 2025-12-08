package modals;

import base.BaseTests;
import org.testng.annotations.Test;

public class BootstrapModalsTests extends BaseTests {

    @Test
    public void testBootstrapModelPage(){
        var bootstrapPage = homePage.clickBootstrapLink();
        bootstrapPage.triggerModal();
        bootstrapPage.modal_clickToAccept();
    }
}

package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavascriptAlertsTests extends BaseTests {

    @Test
  public void testAlert(){
        var alertsPage = homePage.clickJavascriptalertsLink();
        alertsPage.triggerAlert();
        String text = alertsPage.getAlertText();
        assertEquals(text,"I am an alert box!","The alert message is incorrect");
    }

    @Test
    public void testConfirm(){
        var alertsPage = homePage.clickJavascriptalertsLink();
        alertsPage.triggerConfirm();
        alertsPage.alert_clickToDismiss();
        assertEquals(alertsPage.getConfirmMessage(),"You pressed Cancel!","The message is incorrect!");
    }

    @Test
    public void testPrompt(){
        var alertsPage = homePage.clickJavascriptalertsLink();
        alertsPage.triggerPrompt();
        String name = alertsPage.alert_setInput("Assoumpta");
        alertsPage.getPromptMessage();
    }
}
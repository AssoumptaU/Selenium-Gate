package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertBoxDemoPage {
   private WebDriver driver;
   private By firstButton = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[1]/p/button");
   private By secondButton = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[2]/div/p[1]/button");
   private By thirdButton = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/div[3]/p[1]/button");
   private By confirmMessage = By.id("confirm-demo");
   private By promptMessage = By.id("prompt-demo");


    public AlertBoxDemoPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(firstButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(secondButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(thirdButton).click();
    }

//    public void alert_clickToAccept(){
//        driver.switchTo().alert().accept();
//    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getConfirmMessage(){
        return driver.findElement(confirmMessage).getText();
    }
    public String  getPromptMessage(){
        return driver.findElement(promptMessage).getText();
    }

    public String alert_setInput(String nam){
         driver.switchTo().alert().sendKeys(nam);
      alert_clickToDismiss();
        return getPromptMessage();

    }

    public String getAlertText(){
        String txt = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return txt;
    }

}

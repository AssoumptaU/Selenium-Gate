package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootstrapModalsPage {
    private WebDriver driver;
    private By launchModal = By.cssSelector("#__next > section.mt-50 > div > div > div > div:nth-child(1) > button");

    public BootstrapModalsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerModal(){
        driver.findElement(launchModal).click();
    }
    public void modal_clickToAccept(){
        driver.switchTo().alert().accept();
    }
}

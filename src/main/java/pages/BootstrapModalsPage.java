package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BootstrapModalsPage {
    private WebDriver driver;
    private By launchModal = By.cssSelector("#__next > section.mt-50 > div > div > div > div:nth-child(1) > button");
    private By saveChangesButton = By.xpath("//*[@id=\"myModal\"]/div/div/div[1]/button");

    public BootstrapModalsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerModal(){
        driver.findElement(launchModal).click();
//        driver.findElement(saveChangesButton).click();
//        driver.switchTo().alert().accept();
    }
    public void closeModal(){
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(saveChangesButton));
        driver.findElement(saveChangesButton).click();
    }
//    public void modal_clickToAccept(){
}

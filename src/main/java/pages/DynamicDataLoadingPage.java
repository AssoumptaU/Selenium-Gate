package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicDataLoadingPage {
    private WebDriver driver;
    private By getRandomUser = By.xpath("//*[@id=\"save\"]");
    private By loadingDiv = By.id("loading");

    public DynamicDataLoadingPage(WebDriver driver){
        this.driver = driver;

    }

    public DataLoadedPage getRandomUser(){
        driver.findElement(getRandomUser).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingDiv)));
        return new DataLoadedPage(driver);

    }
}

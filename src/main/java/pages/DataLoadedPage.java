package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataLoadedPage {
   private WebDriver driver;
   private By randomUserDiv = By.id("loading");
   private By getRandomUserButton = By.xpath("//*[@id=\"save\"]");



    public DataLoadedPage(WebDriver driver){
        this.driver = driver;
    }

    public void userLoadedPage(){
        driver.findElement(randomUserDiv);
        driver.findElement(getRandomUserButton);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    WebDriver driver;
    private By inputField = By.id("my_field");
    private By message = By.id("result");



    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }
    public void setText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

        public String resultMessage(){
            return driver.findElement(message).getText();
        }

    }



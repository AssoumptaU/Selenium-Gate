package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFileDemoPage {
    private WebDriver driver;
    private By chooseFileInput = By.id("file");
    private By result = By.id("error");

    public UploadFileDemoPage(WebDriver driver){
        this.driver = driver;
    }
    public String clickChooseToChooseFile(String absolutePath){
        driver.findElement(chooseFileInput).sendKeys(absolutePath);
        return driver.findElement(result).getText();
    }



}

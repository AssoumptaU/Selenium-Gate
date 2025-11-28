package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public KeyPressPage clickKeyPressLink(){
        clickLink("Key Press");
        return new KeyPressPage(driver);
    }

    public UploadFileDemoPage clickFileUploadLink(){
        clickLink("Upload File Demo");
        return new UploadFileDemoPage(driver);
    }

    public AlertBoxDemoPage clickJavascriptalertsLink(){
        clickLink("Javascript Alerts");
        return new AlertBoxDemoPage(driver);
    }

    public BootstrapModalsPage clickBootstrapLink(){
        clickLink("Bootstrap Modals");
        return new BootstrapModalsPage(driver);
    }

    public DynamicDataLoadingPage clickDynamicDataLoadingLink(){
        clickLink("Bootstrap Modals");
        return new DynamicDataLoadingPage(driver);
    }

    public FormDemoPage clickInputformSubmitLink(){
        clickLink("Input Form Submit");
        return new FormDemoPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}


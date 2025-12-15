package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormDemoPage {
    private WebDriver driver;
    private By FieldforfirstName = By.id("name");
    private By Fieldforemail = By.id("inputEmail4");
    private By Fieldforpassword = By.id("inputPassword4");
    private By Fieldforcompanyy = By.id("company");
    private By Fieldforwebsite = By.id("websitename");
    private By Fieldforcountry= By.xpath("//*[@id=\"seleniumform\"]/div[3]/div[1]/select");
    private By Fieldforcity = By.id("inputCity");
    private By Fieldforaddress1 = By.id("inputAddress1");
    private By Fieldforaddress2 = By.id("inputAddress2");
    private By Fieldforstate = By.id("inputState");
    private By Fieldforzipcode = By.id("inputZip");
    private By submitButton = By.xpath("//*[@id=\"seleniumform\"]/div[6]/button");
    private By resultMessage = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p");

    public FormDemoPage(WebDriver driver){
        this.driver = driver;
    }
    public void setValuesToFields(String firstName,String email, String password,
                                  String companyy, String  website,String country, String city ,
                                  String address1 ,String address2, String state, String zipcode){

        driver.findElement(FieldforfirstName).sendKeys(firstName);
        driver.findElement(Fieldforemail).sendKeys(email);
        driver.findElement(Fieldforpassword).sendKeys(password);
        driver.findElement(Fieldforcompanyy).sendKeys(companyy);
        driver.findElement(Fieldforwebsite ).sendKeys( website);
        driver.findElement(Fieldforcountry).sendKeys(country);
        driver.findElement(Fieldforcity).sendKeys(city);
        driver.findElement(Fieldforaddress1).sendKeys(address1);
        driver.findElement(Fieldforaddress2).sendKeys(address2);
        driver.findElement(Fieldforstate).sendKeys(state);
        driver.findElement(Fieldforzipcode).sendKeys(zipcode);
        driver.findElement(submitButton).click();
    }

    public Select findDropdownCountry(){
        return new Select(driver.findElement(Fieldforcountry));
    }

    public void selectFromDropdownOptions(String option){
        findDropdownCountry().selectByVisibleText(option);
    }
    public String getResultMessage(){
        return driver.findElement(resultMessage).getText();
    }



}

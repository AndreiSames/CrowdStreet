package CrowdStreetLoginPage.pages;

import CrowdStreetLoginPage.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ActionPage1 {

    public ActionPage1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

            // Test Case :
            // 1. Go to https://test.crowdstreet.com
            // 2. Click on the "CREATE AN ACCOUNT" button
            // 3. Input : first-name, last-name, email-address, password, password-confirmation
            // 4. Select if you are an accredited investor by : Yes or Not
            // 5. Check mark the terms and conditions box
            // 6. Click "Create an account" button

    @FindBy(xpath = "//a[@href='/invexp/accounts/create-account']")
    public WebElement createAccount;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement nameInputSpace;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInputSpace;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputSpace;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputSpace;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPasswordInputSpace;

    @FindBy(xpath = "//input[@id='accreditedYes']")
    public WebElement accreditedYesSelected;

    @FindBy(xpath = "//input[@id='accreditedNo']")
    public WebElement accreditedNoSelected;

    @FindBy(xpath = "//input[@id='hasAgreedTos']")
    public WebElement agreedCheckBoxSelected;


    @FindBy(xpath = "//span[text()='Create an account']")
    public  WebElement createAnAccountButton;

}

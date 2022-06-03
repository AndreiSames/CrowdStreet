package CrowdStreetLoginPage.tests;

import CrowdStreetLoginPage.pages.ActionPage1;
import CrowdStreetLoginPage.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class ActionTest1 {

    ActionPage1 actionPage1 = new ActionPage1();

    @Test
    public void actionTest(){

        // Test Case :

        // 1. Go to https://test.crowdstreet.com
        Driver.getDriver().get("https://test.crowdstreet.com");

        // 2. Click on the "CREATE AN ACCOUNT" button
        actionPage1.createAccount.click();


        // 3. Input : first-name, last-name, email-address, password, password-confirmation
        actionPage1.nameInputSpace.sendKeys("John");
        actionPage1.lastNameInputSpace.sendKeys("Doe");
        actionPage1.emailInputSpace.sendKeys("johndoe@gmail.com");
        actionPage1.passwordInputSpace.sendKeys("Johndoe0001!");
        actionPage1.confirmPasswordInputSpace.sendKeys("Johndoe0001!");


        // 4. Select if you are an accredited investor by : Yes or Not
        //  ----    I will select No each time   ------
        actionPage1.accreditedNoSelected.click();


        // 5. Check mark the terms and conditions box
        actionPage1.agreedCheckBoxSelected.click();


        // 6. Click "Create an account" button
        actionPage1.createAnAccountButton.click();


    }
}

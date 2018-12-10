package pages;

import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLogoutPage extends PageObject {


    @FindBy(css = "li.nav-item:nth-child(5)")
    WebElement loginOption;

    @FindBy(xpath = "/html/body/div[3]/div/div")
    WebElement loginForm;

    @FindBy(id = "logInModalLabel")
    WebElement loginTitle;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[1]")
    WebElement usernameField;

    @FindBy(id = "loginusername")
    WebElement inputUsername;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/form/div[2]")
    WebElement passwordField;

    @FindBy(id = "loginpassword")
    WebElement inputPassword;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
    WebElement closeButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/button")
    WebElement xButton;

    @FindBy(xpath = "/html/body")
    WebElement homePage;

    @FindBy(id = "exampleModal")
    WebElement userPage;

    @FindBy(id = "nameofuser")
    WebElement welcomeuser;

    @FindBy(id = "logout2")
    WebElement logoutButton2;


    // Test 1 : Test the functionality of Login button

    public void loginOption() {
        loginOption.click();
        Assert.assertTrue("The Login option is non-functional", loginForm.isDisplayed());
    }

    // Test 2 : Test the presence of elements form

    public void loginElements() {
        loginOption.click();
        Assert.assertTrue("The login title is not displayed", loginTitle.isDisplayed());
        Assert.assertTrue("The username field is not displayed", usernameField.isDisplayed());
        Assert.assertTrue("The password field is not displayed", passwordField.isDisplayed());
        Assert.assertTrue("The close button is not displayed", closeButton.isDisplayed());
        Assert.assertTrue("The login button is not displayed", loginButton.isDisplayed());
        Assert.assertTrue("The x button is not displayed", xButton.isDisplayed());
    }

    // Test 3 :  Test the close button

    public void closeButtonFunctionality()  {
        loginOption.click();
        Assert.assertTrue("The login title is not displayed", loginForm.isDisplayed());
        waitABit(1000);
        closeButton.click();
        waitABit(1000);
        homePage.isDisplayed();

    }

    // Test 4 : Test the successful login

    public void successfulLogin(String user, String pass)  {
        loginOption.click();
        Assert.assertTrue("The Login option is non-functional", loginForm.isDisplayed());
        waitABit(3000);
        inputUsername.sendKeys(user);
       waitABit(3000);
        inputPassword.sendKeys(pass);
        waitABit(3000);
        loginButton.click();
        waitABit(5000);
        Assert.assertTrue("The welcome user is not display", welcomeuser.isDisplayed());
        logoutButton2.isDisplayed();
    }

    // Test 5 : Test the functionality of logout button

    public void logoutUser()  {
        loginOption.click();
        Assert.assertTrue("The Login option is non-functional", loginForm.isDisplayed());
        waitABit(5000);
        inputUsername.sendKeys("marius");
        waitABit(8000);
        inputPassword.sendKeys("marius");
        waitABit(8000);
        loginButton.click();
        waitABit(5000);
        Assert.assertTrue("The welcome user is not display", welcomeuser.isDisplayed());
        waitABit(5000);
        logoutButton2.click();
        waitABit(5000);
        Assert.assertTrue("The home page is not display", homePage.isDisplayed());

    }

    // Test 6 :  Log in with invalid credentials

    public void invalidCredentials() {

        loginOption.click();
        Assert.assertTrue("The Login option is non-functional", loginForm.isDisplayed());
        waitABit(3000);
        inputUsername.sendKeys("fgzfd");
        waitABit(8000);
        inputPassword.sendKeys("$%^&hg");
        waitABit(8000);
        loginButton.click();
        waitABit(8000);

        // Test 7 : Log in with valid username and invalid password

        // Test 8 : Log in with invalid username and valid password

        // Test 9 : Log in with valid username and blank password

        //Test 10 : Log in with blank username and valid password


    }
}

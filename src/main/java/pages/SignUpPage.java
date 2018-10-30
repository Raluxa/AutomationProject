package pages;

import common.UserInfo;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {


    @FindBy(css = "a.nav-link[data-target*=\"#signInModal\"]")
    WebElement signUp;

    @FindBy(css = "a.nav-link[data-dismiss*=\"modal\"]")
    WebElement closeButton;

    @FindBy(id = "sign-username")
    WebElement usernameField;

    @FindBy(id = "sign-password")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/button[2]")
    WebElement signUpButton;


    // Test 1: Username and Password text is present
    public void loginElements() throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        Assert.assertTrue("Username is not displayed", usernameField.isDisplayed());
        Assert.assertTrue("Password is not displayed", passwordField.isDisplayed());
        Assert.assertTrue("Close is not displayed", closeButton.isDisplayed());
        Assert.assertTrue("Sign Up is not displayed", signUpButton.isDisplayed());
        Thread.sleep(1000);
    }

    // Test 2 : Successful sign up
    public void successfulSignUp(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not displayed", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.username);
        Thread.sleep(1000);
        passwordField.sendKeys(userInfo.password);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 3 : Empty fields sign up
    public void emptyFieldsSignUp() throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not displayed", signUp.isDisplayed());
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 4: Username field with valid credentials and empty field for password
    public void emptyFieldForPasswordSignUp(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not displayed", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.username);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 5: Username field empty with valid credentials and empty field for password
    public void emptyFieldForUsernameSignUp(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        passwordField.sendKeys(userInfo.password);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 6: Invalid credentials (special characters for username and password)
    public void specialCharactersSignUp(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.usernameSpecialCharacters);
        Thread.sleep(1000);
        passwordField.sendKeys(userInfo.passwordSpecialCharacters);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 7: Invalid credentials (Digits for username and password)
    public void digitsSignUp(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.usernameDigits);
        Thread.sleep(1000);
        passwordField.sendKeys(userInfo.passwordDigits);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 8: Invalid credentials (select space to put blank space for username and password )
    public void blankSpaceSignUp() throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        usernameField.sendKeys(" ");
        Thread.sleep(1000);
        passwordField.sendKeys(" ");
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 9: Invalid credentials (valid username and password and a blank space)
    public void validCredentialsAndBlankSpaceSignUp(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.validUsernameBlankSpace);
        Thread.sleep(1000);
        passwordField.sendKeys(userInfo.validPasswordBlankSpace);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 10: Invalid credentials (lowercase credentials for password)
    public void lowercaseCredentials(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.username);
        Thread.sleep(1000);
        passwordField.sendKeys(userInfo.passwordLowercaseCredentials);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }

    // Test 11: Invalid credentials (uppercase credentials for password)
    public void uppercaseCredentials(UserInfo userInfo) throws InterruptedException {
        signUp.click();
        Assert.assertTrue("Sign Up is not functional", signUp.isDisplayed());
        usernameField.sendKeys(userInfo.username);
        Thread.sleep(1000);
        passwordField.sendKeys(userInfo.passwordUppercaseCredentials);
        Thread.sleep(1000);
        signUpButton.click();
        Thread.sleep(1000);

    }
}
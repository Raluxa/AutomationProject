package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageObject {

    @FindBy(css = "a.nav-link[data-toggle*=\"modal\"][data-target*=\"#exampleModal\"]")
    WebElement contactOption;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]")
    WebElement afterClick;

    @FindBy(id = "exampleModalLabel")
    WebElement titleForm;

    @FindBy(id = "recipient-email")
    WebElement contactEmailField;

    @FindBy(id = "recipient-name")
    WebElement contactNameField;

    @FindBy(id = "message-text")
    WebElement messageField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[1]")
    WebElement closeButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[2]")
    WebElement sendMessageButton;


    // Test 1 : Test the functionality of the Contact option
    public void contactOption() {
        contactOption.click();
        Assert.assertTrue("The Contact option is non-functional", afterClick.isDisplayed());

    }

    // Test 2 : Test the presence of elements

    public void contactsElements() {
        contactOption.click();
        Assert.assertTrue("The Title of the contact form is not displayed", titleForm.isDisplayed());
        Assert.assertTrue("The Contact email is not displayed", contactEmailField.isDisplayed());
        Assert.assertTrue("The Contact name is not displayed", contactNameField.isDisplayed());
        Assert.assertTrue("The Contact option is not displayed", messageField.isDisplayed());
        Assert.assertTrue("Close Button option is not displayed", closeButton.isDisplayed());
        Assert.assertTrue("Send message button option is not displayed", sendMessageButton.isDisplayed());

    }

    // Test 3 : Send a message from contact

    public void sendMessage() {
        contactOption.click();
        Assert.assertTrue("The Contact option is non-functional", afterClick.isDisplayed());
        contactEmailField.sendKeys("abc@yahoo.com");
        waitABit(3000);
        contactNameField.sendKeys("ABC");
        waitABit(3000);
        messageField.sendKeys("marius are mere");
        waitABit(3000);
        sendMessageButton.click();

    }

    // Test 4: Test the contact form with blank fields

    public void blankFields() {
        contactOption.click();
        Assert.assertTrue("The Contact option is non-functional", afterClick.isDisplayed());
        sendMessageButton.click();

    }

    // Test 5: Test the contact form with invalid credentials

    public void invalidCredentials() throws InterruptedException {
        contactOption.click();
        Assert.assertTrue("The Contact option is non-functional", afterClick.isDisplayed());
        contactEmailField.sendKeys("!£$%^&*(())_");
        Thread.sleep(3000);
        contactNameField.sendKeys("!£$%^&*(())_");
        Thread.sleep(3000);
        messageField.sendKeys("!£$%^&*(())_");
        Thread.sleep(3000);
        sendMessageButton.click();

    }
}




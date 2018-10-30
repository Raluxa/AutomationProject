package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends PageObject {

   @FindBy (xpath = "/html/body/div[4]/div/div")
   WebElement aboutUsForm;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[3]/a")
    WebElement aboutUsButton;

    @FindBy (xpath = "/html/body/div[4]/div/div/div[3]")
    WebElement closeButton;

    @FindBy (xpath = "/html/body/div[4]/div/div/div[1]/button")
    WebElement xIcon;

    @FindBy (className = "vjs-big-play-button")
    WebElement playButton;

    @FindBy (xpath = "/html/body")
    WebElement homePage;

    @FindBy (id = "example-video")
    WebElement video;

    // Test 1: Test the functionality of "About us" page
       public void aboutUsPage() {
       aboutUsButton.click();
       Assert.assertTrue("About Us button is not functional", aboutUsForm.isDisplayed());
       }

       // Test 2: Test the functionality of close button

    public void closeButton() {
      aboutUsButton.click();
        Assert.assertTrue("About Us button is not functional", aboutUsForm.isDisplayed());
       closeButton.click();
        Assert.assertTrue("Close button is not functional", homePage.isDisplayed());
    }

    // Test 3: Test the functionality of "x" icon

    public void xIcon() {
           aboutUsButton.click();
        Assert.assertTrue("About Us button is not functional", aboutUsForm.isDisplayed());
        xIcon.click();
        Assert.assertTrue("X icon is not functional", homePage.isDisplayed());

    }

    // Test 4 : Test the presence of video and play button

    public void video () {
           aboutUsButton.click();
        Assert.assertTrue("About Us button is not functional", aboutUsForm.isDisplayed());
        Assert.assertTrue("About Us button is not functional", playButton.isDisplayed());
        Assert.assertTrue("About Us button is not functional", video.isDisplayed());

    }
}




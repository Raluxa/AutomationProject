package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject {

    @FindBy ( id= "nava")
    WebElement brandName;

    @FindBy (className= "navbar-nav")
    WebElement pageBar;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[1]/a")
    WebElement homeButton;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[2]/a" )
    WebElement contactButton;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[3]")
    WebElement aboutUsButton;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[4]")
    WebElement cartButton;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[5]")
    WebElement logInButton;

    @FindBy (xpath = "/html/body/nav/div[1]/ul/li[8]")
    WebElement singUpButton;

    @FindBy (id= "contcar")
    WebElement carousel;

    @FindBy (className = "list-group")
    WebElement categoriesMenu;

    @FindBy (id = "cat")
    WebElement catName;

    @FindBy (xpath = "//*[@id=\"itemc\"]")
    WebElement phones;

    @FindBy (xpath = "//*[@id=\"itemc\"]")
    WebElement laptops;

    @FindBy (xpath = "//*[@id=\"itemc\"]")
    WebElement monitors;

    @FindBy (xpath= "/html/body/div[5]/div/div[2]/div/div[4]")
    WebElement productsContainer;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[1]/div")
    WebElement product1;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[2]")
    WebElement product2;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[3]")
    WebElement product3;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[4]")
    WebElement product4;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[5]")
    WebElement product5;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[6]")
    WebElement product6;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[7]")
    WebElement product7;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[8]")
    WebElement product8;

    @FindBy (xpath = "/html/body/div[5]/div/div[2]/div/div[9]")
    WebElement product9;

    @FindBy (id = "prev2")
    WebElement previousButton;

    @FindBy (id = "next2")
    WebElement nextButton;

    @FindBy (id = "footc")
    WebElement footer;

    @FindBy (xpath = "/html/body/div[6]/div/div[1]")
    WebElement aboutUsinf;

    @FindBy (xpath = "/html/body/div[6]/div/div[2]/div/div")
    WebElement otherInf;

    @FindBy (xpath = "/html/body/div[6]/div/div[3]")
    WebElement brandName2;

    // Test 1 : Test the presence of the most important elements

    public void importantElements() {

        Assert.assertTrue("Brand name is not displayed", brandName.isDisplayed());
        Assert.assertTrue("Page bar is not displayed", pageBar.isDisplayed());
        Assert.assertTrue("Carousel is not displayed", carousel.isDisplayed());
        Assert.assertTrue("CategoriesMenu is not displayed", categoriesMenu.isDisplayed());
        Assert.assertTrue("The container with products is not displayed", productsContainer.isDisplayed());
        Assert.assertTrue("Footer is not displayed", footer.isDisplayed());

    }

    // Test 2 : Test the presence of buttons from the page bar

    public void pageBar() {
        Assert.assertTrue("Home button is not displayed", homeButton.isDisplayed());
        Assert.assertTrue("Contact button is not displayed", contactButton.isDisplayed());
        Assert.assertTrue("About us button is not displayed", aboutUsButton.isDisplayed());
        Assert.assertTrue("Cart button is not displayed", aboutUsButton.isDisplayed());
        Assert.assertTrue("Cart button is not displayed", cartButton.isDisplayed());
        Assert.assertTrue("Log in button is not displayed", logInButton.isDisplayed());
        Assert.assertTrue("Sing up button is not displayed", singUpButton.isDisplayed());

    }

    // Test 3 : Test the presence of all section from footer

    public void footerElements() {

        Assert.assertTrue("About us section is not displayed", aboutUsinf.isDisplayed());
        Assert.assertTrue("Get in touch section is not displaed", otherInf.isDisplayed());
        Assert.assertTrue("Brand name is not displayed", brandName2.isDisplayed());
    }

    // Test 4 : Test the presence of elements from product container

    public void productsContainer() {

        Assert.assertTrue("products container is not displayed", productsContainer.isDisplayed());
        Assert.assertTrue("Product1 is not displayed", product1.isDisplayed());
        Assert.assertTrue("Product2 is not displayed", product2.isDisplayed());
        Assert.assertTrue("Product3 is not displayed", product3.isDisplayed());
        Assert.assertTrue("Product4 is not displayed", product4.isDisplayed());
        Assert.assertTrue("Product5 is not displayed", product5.isDisplayed());
        Assert.assertTrue("Product6 is not displayed", product6.isDisplayed());
        Assert.assertTrue("Product7 is not displayed", product7.isDisplayed());
        Assert.assertTrue("Product8 is not displayed", product8.isDisplayed());
        Assert.assertTrue("Product9 is not displayed", product9.isDisplayed());

    }

    // Test 5 : Test the tresence of next and previous buttons

    public void bodyButtons() {

        Assert.assertTrue("Previous button is not displayed", previousButton.isDisplayed());
        Assert.assertTrue("Next button is nor displayed", nextButton.isDisplayed());

    }

    // Test 6 : Test the presence of element from Categories

    public void catgeoriesMenu() {

        Assert.assertTrue("Categories nemu is not displayed", catName.isDisplayed());
        Assert.assertTrue("Phones button is not displayed", phones.isDisplayed());
        Assert.assertTrue("Laptops button is not displayed", laptops.isDisplayed());
        Assert.assertTrue("Monitors button is not displayed", monitors.isDisplayed());
    }

}



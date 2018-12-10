package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.FirstPage;

public class FirstPageSteps extends ScenarioSteps {

    FirstPage sp;

    @Step("Test 1: Importants elements are displayed")
    public void importantElements() {
        sp.importantElements();
    }

    @Step("Test 2: Test the presence of buttons from the page bar")
    public void pageBar() {
        sp.pageBar();
    }

    @Step("Test 3 : Test the presence of all section from footer")
    public void footerElements() {
        sp.footerElements();
    }

    @Step("Test 4 : Test the presence of elements from product container")
    public void productContainer() {
        sp.productsContainer();
    }

    @Step("Test 5 : Test the presence of next and previous buttons")
    public void buttons() {
        sp.bodyButtons();
    }

    @Step("Test 6 : Test the presence of elements from Categories")
    public void elementsCategories() {
        sp.catgeoriesMenu();
    }


}

/*  @Step("Test 1: Product Store is displayed")
    public void productStoreIsDisplayed() {
        sp.assertTitlePresent();} */




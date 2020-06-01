package tests;

import config.TestConfig;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Home;

public class CategoriesNavbarTest extends TestConfig {

    @Test
    public void shouldDisplayAllTopsPage(){
        new Home()
                .openNavbar()
                .hoverOnWomenCategory()
                .showAllTops()
                .shouldDisplayAllTopsPage();
    }
    @Test
    public void shouldAddProductToCart(){
        new Home()
                .openNavbar()
                .hoverOnWomenCategory()
                .showAllTops()
                .addFirstProductsToCart()
                .shouldAddedProductToCart();
    }
}

package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Actions;

public class ProductAddedToCart extends BasePage {
    public ProductAddedToCart() {super(); }
    @FindBy(css = ".button-container span[title=\"Continue shopping\"]")
    private WebElement continueShoppingButton;
    @FindBy(css = ".layer_cart_product h2")
    private WebElement productSuccessfulAddedToCartText;

    public Tops clickOnContinueShoppingButton(){
        continueShoppingButton.click();
        return new Tops();
    }

    public void shouldAddedProductToCart(){
        String h2="Product successfully added to your shopping cart";
        Actions.waitForVisibilityOfElement(productSuccessfulAddedToCartText);
        Assert.assertEquals(productSuccessfulAddedToCartText.getText(),h2);
    }
}

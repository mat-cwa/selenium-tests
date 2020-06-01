package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tops extends BasePage {
    public Tops() {
        super();
    }
    @FindBy(css = ".rte>p")
    private List<WebElement> topsParagaphText;

    @FindBy(css = "a[data-id-product=\"1\"]>span")
    private WebElement addToCartProductWithId1Button;

    @FindBy(css = "a[data-id-product=\"2\"]>span")
    private WebElement addToCartProductWithId2Button;

    @FindBy(css = ".product-image-container>a[title=\"Faded Short Sleeve T-shirts\"]")
    private WebElement productWithId1;

    public void shouldDisplayAllTopsPage(){
        List<String> text= Arrays.asList("Choose from t-shirts, tops, blouses, short sleeves, long sleeves, tank tops, 3/4 sleeves and more.","Find the cut that suits you the best!");
        List<String> paragraphs=new ArrayList<>();

        for (WebElement element:topsParagaphText) {
            paragraphs.add(element.getText());
        }
        Assert.assertTrue(paragraphs.containsAll(text));
    }

    public ProductAddedToCart addFirstProductsToCart(){
        actions.moveToElement(productWithId1).build().perform();
        Actions.waitForVisibilityOfElement(addToCartProductWithId1Button);
        addToCartProductWithId1Button.click();
        return new ProductAddedToCart();
    }
}

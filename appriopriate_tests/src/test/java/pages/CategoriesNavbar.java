package pages;

import config.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.WebDriverEventListener;
import utility.Actions;

public class CategoriesNavbar extends BasePage {

    public CategoriesNavbar() {
        super();
    }

    @FindBy(css = "#block_top_menu a[title=\"Women\"]")
    private WebElement womenCategory;
    @FindBy(linkText = "Dresses")
    private WebElement dressesCategory;
    @FindBy(linkText = "T-shirts")
    private WebElement tshirtsCategory;

    public WomenCategoryNavbar hoverOnWomenCategory(){
        actions.moveToElement(womenCategory).build().perform();
        return new WomenCategoryNavbar();
    }


}

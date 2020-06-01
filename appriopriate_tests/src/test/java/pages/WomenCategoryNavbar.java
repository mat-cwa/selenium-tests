package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategoryNavbar extends BasePage {
    public WomenCategoryNavbar() {
        super();
    }
    @FindBy(css = "a[title=\"Tops\"]")
    private WebElement topsButton;

    public Tops showAllTops(){
        topsButton.click();
        return new Tops();
    }

}

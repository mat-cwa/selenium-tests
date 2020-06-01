package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.DataFaker;

import static config.WebDriverSingleton.getInstance;
import static utility.Actions.waitForVisibilityOfElement;

public class BasePage {

    protected Actions actions;

    public BasePage() {
        PageFactory.initElements(getInstance(), this);
        waitForVisibilityOfElement(pageContent);
        actions = new Actions(getInstance());
    }

    protected DataFaker faker = new DataFaker();

    @FindBy(id = "columns")
    private WebElement pageContent;
}

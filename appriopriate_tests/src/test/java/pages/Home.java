package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static utility.Screenshot.captureScreenshot;

public class Home extends BasePage {

    public Home() {
        super();
    }

    @FindBy(css = "[title=\"Log in to your customer account\"]")
    private WebElement signInButton;
    @FindBy(css = "[title=\"Contact Us\"]")
    private WebElement contactUsButton;

    @Step
    public SignIn openSignInPage() {
        signInButton.click();
        captureScreenshot();

        return new SignIn();
    }
    @Step
    public ContactUs openContactUsPage() {
        contactUsButton.click();
        captureScreenshot();

        return new ContactUs();
    }
    @Step
    public CategoriesNavbar openNavbar(){
        return new CategoriesNavbar();
    }

}

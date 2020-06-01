package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact extends BasePage {
    public Contact() {
        super();
    }

    @FindBy(css = "#center_column > p")
    private WebElement successAlert;

    public void messageShouldBeSendSuccessful() {
        String successSendMessage = "Your message has been successfully sent to our team.";
        Assert.assertEquals(successAlert.getText(),successSendMessage);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utility.DataFaker;

public class ContactUs extends BasePage {
    public ContactUs() {
        super();
    }
    @FindBy(id = "id_contact")
    private WebElement subjectHeading;
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(id = "id_order")
    private WebElement orderReferenceInput;
    @FindBy(id = "message")
    private WebElement messageInput;
    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public Contact fillInSendAMessageForm(){
    new Select(subjectHeading).selectByIndex(1);
    emailInput.sendKeys(faker.getFakeEmail());
    orderReferenceInput.sendKeys("12345");
    messageInput.sendKeys("any message");
    sendButton.click();
     return new Contact();
    }
}

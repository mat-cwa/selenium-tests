package tests;

import config.TestConfig;
import org.junit.Test;
import pages.Home;

public class ContactUsTest extends TestConfig {
    @Test
    public void shouldSendSuccessfulMessageUsingContactForm() {
        new Home()
                .openContactUsPage()
                .fillInSendAMessageForm()
                .messageShouldBeSendSuccessful();
    }
}

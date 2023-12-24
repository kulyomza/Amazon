package testAmazonAuth;

import amazonAuth.MainPage;
import initialSelenide.InitialSelenide;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestAuthWIthNoRegisteredEmail extends InitialSelenide {

    final String URL = "https://www.amazon.com/";
    final String INVALID_EMAIL = "johnsilverhand@yopmail.com";
    final String EXPECTED_ERROR_MESSAGE = "There was a problem" +
            "\nWe cannot find an account with that email address";

    @Test
    @Owner("Ihor Kulyomza")
    @Description("Displaying error block when user login with invalid email")
    @Severity(SeverityLevel.NORMAL)
    public void testLoginWithNoRegEmail(){
        open(URL);
        String actualErrorMessage =
                new MainPage().openSignInPage()
                        .enterEmail(INVALID_EMAIL)
                        .validationLoginInput().alertBlockLoginForm()
                        .errorMessage();
        Assert.assertEquals(actualErrorMessage, EXPECTED_ERROR_MESSAGE, "Error messages isn't equal");

    }
}

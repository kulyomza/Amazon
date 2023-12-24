package testAmazonAuth;

import amazonAuth.MainPage;
import initialSelenide.InitialSelenide;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestAuthWithInvalidPhoneNumber extends InitialSelenide {
    final String URL = "https://www.amazon.com/";
    final String INVALID_PHONE_NUMBER = "380669614521";
    final String EXPECTED_ERROR_MESSAGE = "Incorrect phone number" +
            "\nWe cannot find an account with that mobile number";

    @Test
    @Owner("Ihor Kulyomza")
    @Description("Displaying error block when user login with invalid phone number")
    @Severity(SeverityLevel.NORMAL)
    public void testLoginWithNoRegEmail(){
        open(URL);
        String actualErrorMessage =
                new MainPage().openSignInPage()
                        .enterPhoneNumber(INVALID_PHONE_NUMBER)
                        .validationLoginInput().alertBlockLoginForm()
                        .errorMessage();
        Assert.assertEquals(actualErrorMessage, EXPECTED_ERROR_MESSAGE, "Error messages isn't equal");

    }
}

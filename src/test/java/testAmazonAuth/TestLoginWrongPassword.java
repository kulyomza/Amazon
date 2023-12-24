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

public class TestLoginWrongPassword extends InitialSelenide {
    final String URL = "https://www.amazon.com/";
    final String PHONE_NUMBER = "380669614520";
    final String PASSWORD = "225588";
    final String EXPECTED_ERROR_MESSAGE = "There was a problem" +
            "\nYour password is incorrect";

    @Test
    @Owner("Ihor Kulyomza")
    @Description("Test error message when enter invalid password")
    @Severity(SeverityLevel.NORMAL)
    public void testSuccessAuth(){
        open(URL);
        String actualErrorMessage = new MainPage().openSignInPage().enterPhoneNumber(PHONE_NUMBER)
                .pressContinueButton().enterPassword(PASSWORD)
                        .validationPasswordInput().alertBlockPasswordForm().errorMessage();
        Assert.assertEquals(actualErrorMessage, EXPECTED_ERROR_MESSAGE, "Error messages isn't equal");


    }

}

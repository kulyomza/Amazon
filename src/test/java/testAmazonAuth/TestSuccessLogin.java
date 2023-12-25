package testAmazonAuth;

import amazonAuth.MainPage;
import initialSelenide.InitialSelenide;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSuccessLogin extends InitialSelenide {

    final String URL = "https://www.amazon.com/";
    final String PHONE_NUMBER = "380669614520";
    final String PASSWORD = "225588Jv";
    final String GREETIN_TEXT = "Hello, Ihor";

    @Test
    @Owner("Ihor Kulyomza")
    @Description("Test successes authorization by phone number")
    @Severity(SeverityLevel.NORMAL)
    public void testSuccessAuth(){
        open(URL);
        String actualSigInResult = new  MainPage().openSignInPage().enterPhoneNumber(PHONE_NUMBER)
                .pressContinueButton().enterPassword(PASSWORD)
                .pressSignInButton().greetingText();
        Assert.assertEquals(actualSigInResult,GREETIN_TEXT, "Greeting text is not equals");


    }


}

package amazonAuth;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SignInPageLocators {

    SelenideElement emailInput = $(By.id("ap_email"));
    SelenideElement phoneNumber = $(By.id("ap_email"));
    SelenideElement continueButton = $(By.id("continue"));
    SelenideElement alertContainer = $(By.id("auth-error-message-box"));
    SelenideElement submitButton = $(By.id("signInSubmit"));
    SelenideElement passwordInput = $(By.id("ap_password"));
    SelenideElement needHelp = $(byXpath("//span[@class='a-expander-prompt']"));
    SelenideElement issuesWithSignIn = $(By.id("ap-other-signin-issues-link"));


}

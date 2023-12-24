package amazonAuth;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class SignInPagePasswordForm extends SignInPageLocators{
    @Step("Submit authorization and redirect to main page")
    public AuthorizedMainPage pressSignInButton(){
        submitButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return page(AuthorizedMainPage.class);
    }
    @Step("Enter password")
    public SignInPagePasswordForm enterPassword(String password){
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(5)).setValue(password);
        return this;
    }
    @Step("Displaying alert block")
    public SignInPagePasswordForm alertBlockPasswordForm(){
        alertContainer.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }
    @Step("Get error message when wrong password")
    public String errorMessage() {
        String invalidEmailError = alertContainer.getText();
        return invalidEmailError;
    }
    @Step("Click on submit button")
    public SignInPagePasswordForm validationPasswordInput(){
        submitButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }
}

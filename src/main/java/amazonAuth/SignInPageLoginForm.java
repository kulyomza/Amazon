package amazonAuth;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class SignInPageLoginForm extends SignInPageLocators implements IHeader{
    @Step("Enter email")
    public SignInPageLoginForm enterEmail(String email){
        emailInput.shouldBe(Condition.visible, Duration.ofSeconds(10)).setValue(email);
        return this;
    }
    @Step("Enter phone number")
    public SignInPageLoginForm enterPhoneNumber(String userNumber){
        phoneNumber.shouldBe(Condition.visible, Duration.ofSeconds(5)).setValue(userNumber);
        return this;

    }
    @Step("Press button 'continue' for entering password")
    public SignInPagePasswordForm pressContinueButton(){
        continueButton.shouldBe(Condition.visible,Duration.ofSeconds(5)).click();
        return page(SignInPagePasswordForm.class);
    }
    @Step("Click on submit button")
    public SignInPageLoginForm validationLoginInput(){
        continueButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }
    @Step("Error notification")
    public SignInPageLoginForm alertBlockLoginForm(){
        alertContainer.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }
    @Step("Get error message from alert container when wrong email")
    public String errorMessage(){
        String invalidEmailError = alertContainer.getText();
        return invalidEmailError;
    }




}

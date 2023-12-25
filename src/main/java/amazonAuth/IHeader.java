package amazonAuth;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface IHeader {
    SelenideElement signInButton = $(By.id("nav-link-accountList-nav-line-1"));

    @Step("Open signIn page")
    default void openSignInPageI(){
        signInButton.shouldBe(Condition.visible).click();
    }

}

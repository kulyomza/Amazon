package amazonAuth;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface IAuthorizedHeader {
    SelenideElement greetingString = $(By.id("nav-link-accountList-nav-line-1"));
    @Step("Get greeting text")
    default String authorizedMainPageI(){
        return greetingString.shouldBe(Condition.appear).getText().trim();
    }
}

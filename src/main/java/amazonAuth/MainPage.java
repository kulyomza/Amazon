package amazonAuth;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.page;

public class MainPage implements IHeader{

    @Step("Redirect to SignIn page")
    public SignInPageLoginForm openSignInPage(){
        openSignInPageI();
        return page(SignInPageLoginForm.class);
    }


}

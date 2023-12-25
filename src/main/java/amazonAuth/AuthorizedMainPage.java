package amazonAuth;

import io.qameta.allure.Step;

public class AuthorizedMainPage implements IAuthorizedHeader{

    @Step("Get greeting text")
    public String greetingText(){
        return authorizedMainPageI();
    }
}

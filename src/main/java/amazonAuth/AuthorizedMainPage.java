package amazonAuth;

import io.qameta.allure.Step;

public class AuthorizedMainPage implements IAuthorizedHeader{

    @Step
    public String greetingText(){
        return authorizedMainPageI();
    }
}

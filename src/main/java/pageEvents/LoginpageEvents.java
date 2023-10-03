package pageEvents;

import base.BaseTest;
import pageElements.LoginPageElements;
import utils.ElementFetch;

public class LoginpageEvents extends BaseTest {
    ElementFetch element=new ElementFetch();
    public void signInButton(){
        element.getWebElement("XPATH", LoginPageElements.loginButton).click();
    }
}

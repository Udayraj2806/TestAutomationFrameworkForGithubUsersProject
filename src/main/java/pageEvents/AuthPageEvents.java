package pageEvents;

import pageElements.AuthPageElements;
import utils.ElementFetch;

public class AuthPageEvents {
    ElementFetch element=new ElementFetch();
        public void enterCredentialsToLogin(){
            element.getWebElement("XPATH",AuthPageElements.mailIdTextBox).sendKeys("gadikaruday28@gmail.com");
            element.getWebElement("XPATH",AuthPageElements.passwordTextBox).sendKeys("Urraj28@");
            element.getWebElement("XPATH",AuthPageElements.loginButton).click();
        }
}

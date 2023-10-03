package qa;

import base.BaseTest;
import org.testng.annotations.Test;
import pageElements.AuthPageElements;
import pageEvents.AuthPageEvents;
import pageEvents.LoginpageEvents;

public class TestCase1 extends BaseTest {

    LoginpageEvents loginPage=new LoginpageEvents();
    AuthPageEvents authPage=new AuthPageEvents();
    @Test
    public void Test(){
        loginPage.signInButton();
        authPage.enterCredentialsToLogin();
    }
}

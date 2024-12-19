package steps.private_account;

import org.junit.Assert;

import static models.InstancesLogin.SIGN_IN_PAGE;
import static models.InstancesPrivateAccount.HOME_PAGE;

public class HomePageSteps {

    public void viewAccount(String userName) {
        Assert.assertEquals("The login was not successful", userName, HOME_PAGE.captureUsername());
    }

    public void logOut() {
        HOME_PAGE.clickAvatar();
        HOME_PAGE.clickLogOut();
        Assert.assertTrue("The logout was not successful", SIGN_IN_PAGE.viewSigInPage());

    }
}

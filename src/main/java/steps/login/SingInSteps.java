package steps.login;

import org.junit.Assert;

import static models.InstancesLogin.SIGN_IN_PAGE;

public class SingInSteps {

    public void enterTheAccount(String email, String password) {
        SIGN_IN_PAGE.enterEmail(email);
        SIGN_IN_PAGE.enterPassword(password);
        SIGN_IN_PAGE.clickSignIn();
    }

    public void enterTheAccountWhitValidation(String email, String password) {
        SIGN_IN_PAGE.enterEmail(email);
        validateUserPasswordField(email, password);
        SIGN_IN_PAGE.enterPassword(password);
        validateUserNameField(email);
        SIGN_IN_PAGE.clickSignIn();
    }

    public void validateUserPasswordField(String email, String password){
        String passwordFail = password.substring(0, password.length() - 3);
        SIGN_IN_PAGE.enterPassword(passwordFail);
        SIGN_IN_PAGE.clickSignIn();
        Assert.assertTrue("The password validation is not visible", SIGN_IN_PAGE.validateAlertIncorrectPassword());

    }

    public void validateUserNameField(String email){
        String emailFail = email.replace("@", "");
        SIGN_IN_PAGE.enterEmail(emailFail);
        Assert.assertEquals("The Sign In button is enable whit a format fail email", "true", SIGN_IN_PAGE.validateActivationButtonSignIn());
    }

    public void enterToRegister() {
        SIGN_IN_PAGE.clickSignUp();
    }

    public void viewAccountCreationAlert() {
        Boolean alertOk = SIGN_IN_PAGE.captureSuccessfulRegistrationAlert();
        Assert.assertTrue("the account has not been created", alertOk);
    }
}

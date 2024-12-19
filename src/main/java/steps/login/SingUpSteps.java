package steps.login;

import org.junit.Assert;

import static models.InstancesLogin.SIGN_UP_PAGE;
import static utils.Base.viewForTime;

public class SingUpSteps {

    public void filOutRegistration(String fullName, String email, String password) {
        SIGN_UP_PAGE.enterFullName(fullName);
        SIGN_UP_PAGE.enterEmail(email);
        SIGN_UP_PAGE.enterPassword(password);
        SIGN_UP_PAGE.confirmPassword(password);

    }

    public void validateFields(String fullName, String email, String password) {
        validateFieldFullName(fullName);
        SIGN_UP_PAGE.enterFullName(fullName);
        validateEmail(email);
        SIGN_UP_PAGE.enterEmail(email);
        validateFieldPassword(password);
        SIGN_UP_PAGE.enterPassword(password);
        SIGN_UP_PAGE.confirmPassword(password);
    }

    // TC - Validate that the name field accepts at least 2 words
    public void validateFieldFullName (String fullName){
        String[] names = fullName.split(" ");
        SIGN_UP_PAGE.enterFullName(names[0]);
        viewForTime(2000);
        Assert.assertEquals("The system allows you to create the account with a single name", "true", SIGN_UP_PAGE.validateActivationButtonSignUp());
    }

    // TC - Verify that the email complies with the standard format and is unique in the database
    public void validateEmail(String email){
        String emailFail = email.replace("@", "");
        SIGN_UP_PAGE.enterEmail(emailFail);
        Assert.assertEquals("The system is accepting the wrong format in the email field", "true", SIGN_UP_PAGE.validateActivationButtonSignUp());
    }

    //Validate that the password meets the length and character requirements
    //Verify that the system reports if the passwords entered do not match
    public void validateFieldPassword(String password){
        String[] passwordFail = new String[] {"passw.1", "Passw.1", "Password1", "Password.", "password1."};
        for(int i = 0; i <= passwordFail.length-1; i++){
            SIGN_UP_PAGE.enterPassword(passwordFail[i]);
            Assert.assertEquals("password mismatch alert is not visible", "Passwords do not match", SIGN_UP_PAGE.captureAlertPasswordDoNotMatch());
            SIGN_UP_PAGE.confirmPassword(passwordFail[i]);
            Assert.assertEquals("The system is not performing the correct validation of the password format", "true", SIGN_UP_PAGE.validateActivationButtonSignUp());
        }
    }

    public void register(){SIGN_UP_PAGE.clickSignUp();}
}

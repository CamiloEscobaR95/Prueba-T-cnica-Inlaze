package pages.login;
import utils.Base;

import static pages.login.LocatorsLogin.*;

public class SingInPage extends Base {

    public void enterEmail(String email) {
        clear(INPUT_EMAIL_LOCATOR);
        waitingForElement(INPUT_EMAIL_LOCATOR,10);
        type(INPUT_EMAIL_LOCATOR,email);
    }

    public void enterPassword(String password) {
        clear(INPUT_PASSWORD_LOCATOR);
        waitingForElement(INPUT_PASSWORD_LOCATOR,5);
        type(INPUT_PASSWORD_LOCATOR,password);
    }

    public void clickSignIn() {
        waitingForElement(BTN_SIGN_IN_LOCATOR, 10);
        click(BTN_SIGN_IN_LOCATOR);
        viewForTime(2000);
    }

    public void clickSignUp() {
        waitingForElement(BTN_SIGNUP_LOCATOR1, 10);
        click(BTN_SIGNUP_LOCATOR1);
    }

    public Boolean captureSuccessfulRegistrationAlert() {
        waitingForElement(ALERT_SUCCESSFUL_REGISTER_LOCATOR, 5);
        return isDisplayed(ALERT_SUCCESSFUL_REGISTER_LOCATOR);
    }

    public boolean viewSigInPage(){
        return isDisplayed(TITLE_PAGE_LOCATOR);
    }

    public boolean validateAlertIncorrectPassword() {
        waitingForElement(ALERT_INCORRECT_PASSWORD_LOCATOR, 5);
        return isDisplayed(ALERT_INCORRECT_PASSWORD_LOCATOR);
    }

    public String validateActivationButtonSignIn() {
        return getAttribute(BTN_SIGN_IN_LOCATOR, "disabled");
    }
}

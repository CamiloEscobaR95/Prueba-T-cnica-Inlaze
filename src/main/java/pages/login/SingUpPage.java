package pages.login;
import utils.Base;

import static pages.login.LocatorsLogin.*;

public class SingUpPage extends Base {

    public void enterFullName(String fullName) {
        waitingForElement(INPUT_FULL_NAME_LOCATOR, 10);
        clear(INPUT_FULL_NAME_LOCATOR);
        type(INPUT_FULL_NAME_LOCATOR, fullName);
        viewForTime(2000);
    }

    public void enterEmail(String email) {
        waitingForElement(INPUT_EMAIL_LOCATOR, 10);
        clear(INPUT_EMAIL_LOCATOR);
        type(INPUT_EMAIL_LOCATOR, email);
        viewForTime(2000);
    }

    public void enterPassword(String password) {
        waitingForElement(INPUT_PASSWORD_LOCATOR, 10);
        clear(INPUT_PASSWORD_LOCATOR);
        click(VIEW_PASSWORD_LOCATOR);
        type(INPUT_PASSWORD_LOCATOR,password);
        viewForTime(1000);
        click(VIEW_PASSWORD_LOCATOR);
    }

    public void confirmPassword(String password) {
        waitingForElement(INPUT_PASSWORD_CONFIRM_LOCATOR, 10);
        clear(INPUT_PASSWORD_CONFIRM_LOCATOR);
        click(VIEW_PASSWORD_LOCATORB);
        type(INPUT_PASSWORD_CONFIRM_LOCATOR, password);
        viewForTime(1000);
        click(VIEW_PASSWORD_LOCATORB);
    }

    public void clickSignUp() {
        waitingForElement(BTN_SIGNUP_LOCATOR2, 10);
        click(BTN_SIGNUP_LOCATOR2);
        viewForTime(2000);
    }

    public String validateActivationButtonSignUp() {
        return getAttribute(BTN_SIGNUP_LOCATOR2, "disabled");
    }

    public String captureAlertPasswordDoNotMatch() {
        waitingForElement(ALERT_PASSWORD_DO_NOT_MATCH_LOCATOR, 5);
        return getText(ALERT_PASSWORD_DO_NOT_MATCH_LOCATOR);
    }
}

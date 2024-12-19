package pages.private_account;

import utils.Base;

import static pages.private_account.LocatorsPrivateAccount.*;

public class HomePage extends Base {

    public String captureUsername() {
        waitingForElement(LABEL_USER_NAME, 10);
        return getText(LABEL_USER_NAME);
    }

    public void clickAvatar() {
        waitingForElement(IMAGE_AVATAR, 10);
        click(IMAGE_AVATAR);
    }

    public void clickLogOut() {
        waitingForElement(OPTION_LIST_LOG_OUT, 3);
        click(OPTION_LIST_LOG_OUT);
    }
}

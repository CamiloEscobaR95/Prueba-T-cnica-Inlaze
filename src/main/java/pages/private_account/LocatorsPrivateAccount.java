package pages.private_account;

import org.openqa.selenium.By;

public class LocatorsPrivateAccount {

    public static final By LABEL_USER_NAME = By.xpath("//h2[@class='font-bold']");
    public static final By IMAGE_AVATAR = By.xpath("//img[@src='/assets/rengoku.webp']");
    public static final By OPTION_LIST_LOG_OUT = By.xpath("//li//a[contains(text(), 'Logout')]");

}

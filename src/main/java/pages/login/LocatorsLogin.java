package pages.login;

import org.openqa.selenium.By;

public class LocatorsLogin {

    public static By TITLE_PAGE_LOCATOR = By.xpath("//h1[contains(text(), 'Sign in')]");
    public static By ALERT_SUCCESSFUL_REGISTER_LOCATOR = By.xpath("//div[contains(text(), 'Successful registration!')]");
    public static By ALERT_PASSWORD_DO_NOT_MATCH_LOCATOR = By.xpath("//span[@class='label-text-alt text-error']");
    public static By ALERT_INCORRECT_PASSWORD_LOCATOR = By.xpath("//div[@class='ml-3 text-sm font-normal']");

    public static By INPUT_FULL_NAME_LOCATOR = By.xpath("//input[@id='full-name']");
    public static By INPUT_EMAIL_LOCATOR = By.xpath("//input[@id='email']");
    public static By INPUT_PASSWORD_LOCATOR = By.xpath("//input[@id='password']");
    public static By VIEW_PASSWORD_LOCATOR = By.xpath("(//button[@class='btn btn-primary join-item'])[1]");
    public static By VIEW_PASSWORD_LOCATORB = By.xpath("(//button[@class='btn btn-primary join-item'])[2]");
    public static By INPUT_PASSWORD_CONFIRM_LOCATOR = By.xpath("//input[@id='confirm-password']");

    public static By BTN_SIGN_IN_LOCATOR = By.xpath("//button[contains(text(), 'Sign in')]");
    public static By BTN_SIGNUP_LOCATOR1 = By.xpath("//a[contains(text(),'Sign up')]");
    public static By BTN_SIGNUP_LOCATOR2 = By.xpath("//button[contains(text(),'Sign up')]");

}

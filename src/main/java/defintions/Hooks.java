package defintions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static models.ConstantPaths.URL_HOME_PAGE;

public class Hooks {

    public static WebDriver CHROME_DRIVER;

    public static WebDriver getChromeDriver() {
        return CHROME_DRIVER;
    }

    public static void setChromeDriver(WebDriver chromeDriver) {
        Hooks.CHROME_DRIVER = chromeDriver;
    }


    @Before
    public void setUp(){

        switch(SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.chrome.driver"));
                startChrome();
                break;
        }
    }

    @After
    public void tearDown(){
        CHROME_DRIVER.quit();
    }



    private void startChrome() {
        CHROME_DRIVER = new ChromeDriver();
        CHROME_DRIVER.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        CHROME_DRIVER.manage().window().maximize();
        CHROME_DRIVER.get(URL_HOME_PAGE);
    }
}

package utils;

import defintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static defintions.Hooks.CHROME_DRIVER;

public class Base {


    public void waitingForElement(By locator, long segundos){
        WebDriverWait wait = new WebDriverWait(CHROME_DRIVER, segundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator){CHROME_DRIVER.findElement(locator).click();}
    public void clear(By locator){
        CHROME_DRIVER.findElement(locator).clear();
    }
    public void type(By locator, String txt){
        CHROME_DRIVER.findElement(locator).sendKeys(txt);
    }
    public String getText(By locator){return CHROME_DRIVER.findElement(locator).getText();}
    public Boolean isDisplayed(By locator){try {return CHROME_DRIVER.findElement(locator).isDisplayed();} catch (NoSuchElementException e){return false;}}
    public String getAttribute(By locator, String attribute){
        return CHROME_DRIVER.findElement(locator).getAttribute(attribute);
    }
    public static void viewForTime(long miliSeconds) {
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}

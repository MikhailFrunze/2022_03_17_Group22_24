// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UnchallengedTest extends BaseTest {

    @Test
    public void uncheckedPositive() {
        uncheckedPositiveTest = homePage.goToCheckboxesPage();
        uncheckedPositiveTest.checkElement();
        assert (uncheckedPositiveTest.getCheckBox2().size() == 1);
        /*assert (uncheckedpositiveTest.getCheckBox02() == false);*/
    }


    /*@Test
    public void uncheckedpositive() {
        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.cssSelector("input:nth-child(3)")).click();
        assertFalse(driver.findElement(By.cssSelector("input:nth-child(3)")).isSelected());
    }*/
}
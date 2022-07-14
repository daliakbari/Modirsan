package com.rbittencourt.ui.test;
import com.rbittencourt.ui.driver.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

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
import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import com.rbittencourt.ui.driver.DriverFactory;
import com.rbittencourt.ui.page.ProductListPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;
@ExtendWith(ReportPortalExtension.class)
public class Mci_Services {
    private static WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.getInstance();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void listsOffices() {
        driver.get("https://mci.ir/");
        driver.manage().window().setSize(new Dimension(1408, 1408));
        driver.findElement(By.linkText("دفاتر و نمایندگی ها")).click();
        driver.findElement(By.id("select2-centerType-container")).click();
        driver.findElement(By.cssSelector(".odd:nth-child(1) .show-location")).click();
        driver.findElement(By.cssSelector(".close-map > .zmdi")).click();
        driver.findElement(By.id("select2-province-container")).click();
        driver.findElement(By.id("select2-city-container")).click();
        driver.findElement(By.cssSelector(".select2-selection__placeholder")).click();
        driver.findElement(By.cssSelector(".show-location")).click();
        driver.findElement(By.cssSelector(".show-location")).click();
        driver.findElement(By.cssSelector(".close-map")).click();
        driver.close();
    }
}

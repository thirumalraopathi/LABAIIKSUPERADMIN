package com.qa.testcases;

import com.qa.base.DomocranceBase;
import com.qa.pages.RegistrationPage;
import com.qa.util.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class RegistrationTest extends DomocranceBase {


    RegistrationPage registrationPage;


    public RegistrationTest() throws IOException {
    }

    //WebDriver driver;
//    FirefoxOptions firefoxoptions = new FirefoxOptions();
//    ChromeOptions chromeOptions = new ChromeOptions();
//    SafariOptions safariOptions = new SafariOptions();

    @Parameters("browser")
    @BeforeTest
    public void setUplaunch(String browser) throws Exception {

        setUp(prop.getProperty("URL"));
        System.out.println("Verifying launch of registration page");

        registrationPage = new RegistrationPage();
    }

    @Test(enabled = true ,priority = 1,groups = {"Regression"})
    public void Registration() throws Exception {

        System.out.println("Verifying Registration page");
        Thread.sleep(35000);
        registrationPage.clickdatepick();
       // WebElement datePicker = driver.findElement(By.xpath("//input[@data-e2e='field-insured_age']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Thread.sleep(2000);
        registrationPage.clickinsuredbirthdayyear();
         Thread.sleep(2000);
        registrationPage.clickinsuredbirthdaydate();
        Thread.sleep(2000);

        registrationPage.clickselectsalaryrange();

        Thread.sleep(2000);
        registrationPage.clickpremiumperiod();
         Thread.sleep(2000);
        registrationPage.clicknextyourquote();
        // Thread.sleep(2000);
        Thread.sleep(10000);
        registrationPage.clicktermsandcondition();
        Thread.sleep(4000);
        registrationPage.clickproducttermsandcondition();
        // Thread.sleep(2000);
        registrationPage.clicknextcontinue();
         Thread.sleep(10000);
        registrationPage.clickinsuredtitle();
        // Thread.sleep(2000);
        registrationPage.enterinsuredname("test1");
        // Thread.sleep(2000);
        registrationPage.clicknationality();
        // Thread.sleep(2000);
        registrationPage.selectnationality();
        // Thread.sleep(2000);
       // driver.findElement(By.xpath("//div[@class=\"control has-icons-left has-icons-right\"]/input[@name =\"email_address\"]")).sendKeys("Test@gmail.com");
        registrationPage.clickemailid("Test@gmail.com");
        // Thread.sleep(2000);
        registrationPage.entermobilenumber("500000000");
        // Thread.sleep(2000);
        registrationPage.enteremirestesid("100000000000");
        // Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        registrationPage.clickemiratesidexpiryiddatepick();
        registrationPage.enteremiratesexpiryyear("2026");
        registrationPage.clickemiratesidexpirtydate();
        registrationPage.clicknextsummary();
       // Thread.sleep(10000);
        registrationPage.clickconfirmandbuynow();
        registrationPage.clickgenerateinvoice();
        registrationPage.clickpaymentreference("23233");
        registrationPage.clickfinalcontinue();
        registrationPage.clickdownloadpolicyschedule();
        String productcongratslabel = registrationPage.getsuccesslabel();
        Assert.assertEquals(productcongratslabel, Constant.sucesslabel);
    }
    @AfterTest
    public void tierMethod() {
        DomocranceBase.driver.quit();
    }
}

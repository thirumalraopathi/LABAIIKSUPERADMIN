package com.qa.pages;

import com.qa.base.DomocranceBase;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends DomocranceBase {


    public RegistrationPage() throws IOException {

        PageFactory.initElements(driver,this);
    }

    //@FindBy(id="insured_age")
    @FindBy(xpath="//div/div[@data-field-name=\"insured_age\"]")
    WebElement insuredage;

    @FindBy(xpath ="//div/input[@data-e2e=\"field-emirates_id_expiry_date\"]")
    WebElement expirydatepick;


    @FindBy(xpath ="//div[@class='control']/span/select/option[@value = \"2026\"]")
    WebElement emirateexpiryyear;


    @FindBy(xpath ="//div[@class='datepicker-row']/a[span='1']")
    WebElement emirateexpirydate;

    @FindBy(xpath ="//button[@class=\"button button-next is-primary is-expanded\"]")
    WebElement nextsummary;

    @FindBy(xpath ="(//button[@class=\"button is-fullwidth payment-button\"]/span)[position()=1]")
    WebElement generateinvoice;

    @FindBy(xpath="//div[@class='control has-icons-left has-icons-right is-clearfix']/input[@name ='payment_reference']")
    WebElement paymentreference;

    @FindBy(xpath ="//button[@class='button is-fullwidth is-primary payment-button']")
    WebElement finalcontinue;

    @FindBy(xpath="(//button[@class='button coiButton']/span)[position()=2]")
    WebElement downloadpolicyschedule;

    @FindBy(xpath="(//div[@class=\"button touch-buttons is-small\"]/span)[position()=1]")
    WebElement clickinsuredtitle;

    @FindBy(xpath="//div/input[@name =\"full_name\"]")
    WebElement clickinsurname;

    @FindBy(xpath="//div[@fieldplaceholder=\"Nationality\"]")
    WebElement nationality;

    @FindBy(xpath="(//div[@fieldplaceholder=\"Nationality\"]//div[@class='dropdown-menu is-opened-top']/div/a/div/span)[position()=103]")
    WebElement selectnationality;

    @FindBy(xpath="//div/button[@class=\"button button-next is-primary is-expanded\"]")
    WebElement nextyourquote;

    @FindBy(xpath="//div/input[@name =\"email_address\"]")
    WebElement emailaddress;

    @FindBy(xpath="//div[@class='control']/span/select/option[@value = \"1990\"]")
    WebElement selectbirthdayyear;

    @FindBy(xpath="//div[@class='datepicker-row']/a[span='1']")
    WebElement selectbirthdaydate;

    @FindBy(xpath="(//div[@class='field field-wrapper selectField is-visible-field']/div[@id='salary_range']/div/div/div/section/div)[position()=1]")
    WebElement selectsalaryrange;

    @FindBy(xpath="(//div[@class=\"button touch-buttons is-small is-active\"])[position()=2]")
    WebElement premiumperiod;

    @FindBy(xpath="(//section/div[@class='groupBody']/div/label/span[@class='check is-info'])[position()=1]")
    WebElement termsandcondition;

    @FindBy(xpath="(//section/div[@class='groupBody']/div/label/span[@class='check is-info'])[position()=2]")
    WebElement producttermsandcondition;

    @FindBy(xpath= "//button[@class=\"button button-next is-primary is-expanded\"]")
    WebElement nextcontinue;

    @FindBy(xpath="//div[@class='control is-expanded has-icons-right']/input[@placeholder='Mobile Number']")
    WebElement mobilenumber;

    @FindBy(xpath="//div[@class='control has-icons-left  is-clearfix']/input[@data-e2e='field-emirates_id']")
    WebElement emiratesid;


    @FindBy(xpath="//div/div[@data-route-type=\"policy\"]/section/section/section/div/h1")
    WebElement successlabel;



    public void clickdatepick(){
        insuredage.click();
    }

    public void clickemiratesidexpiryiddatepick(){
        expirydatepick.click();
    }


    public void enteremiratesexpiryyear(String year){
        emirateexpiryyear.sendKeys(year);
    }

    public void enterinsuredname(String name){
        clickinsurname.sendKeys(name);
    }


    public void clickemiratesidexpirtydate(){
        emirateexpirydate.click();
    }

    public void clicknextsummary(){
        nextsummary.click();
    }
    public void clickconfirmandbuynow(){
        nextsummary.click();
    }

    public void clickgenerateinvoice(){
        generateinvoice.click();
    }

    public void clickpaymentreference(String paymentref){
        paymentreference.sendKeys(paymentref);
    }

    public void clickemailid(String emailid){
        emailaddress.sendKeys(emailid);
    }

    public void entermobilenumber(String mobilenumb){
        mobilenumber.sendKeys(mobilenumb);
    }

    public void enteremirestesid(String emirateid){
        emiratesid.sendKeys(emirateid);
    }

    public void clicknationality(){
        nationality.click();
    }

    public void selectnationality(){
        selectnationality.click();
    }

    public void clickfinalcontinue(){
        finalcontinue.click();
    }

    public void clickdownloadpolicyschedule(){
        downloadpolicyschedule.click();
    }

    public void clickinsuredtitle(){
        clickinsuredtitle.click();
    }

    public void clicknextyourquote(){
        nextyourquote.click();
    }

    public void clickinsuredbirthdayyear(){
        selectbirthdayyear.click();
    }

    public void clickinsuredbirthdaydate(){
        selectbirthdaydate.click();
    }

    public void clickselectsalaryrange(){
        selectsalaryrange.click();
    }

    public void clickpremiumperiod(){
        premiumperiod.click();
    }

    public void clicktermsandcondition()
    {
        termsandcondition.click();
    }

    public void clickproducttermsandcondition()
    {
        producttermsandcondition.click();
    }

    public void clicknextcontinue(){
        nextcontinue.click();
    }

    public String getsuccesslabel(){
        return successlabel.getText();
    }

}

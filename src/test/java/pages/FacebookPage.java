package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
    Then  email kutusuna yanlis "<email>" girer
    And   sifre kutusuna yanlis "<sifre>" girer
    And   giris yap butonuna tikar
    And   girdigin sifre yanlis yazi elementinin gorunur oldugunu test eder
     */

   @FindBy(xpath = "//input[@id='email']") public WebElement emailKutusu;

   @FindBy(xpath = "//input[@id='pass']") public WebElement sifreKutusu;

   @FindBy(xpath = "//button[@name='login']") public WebElement girisYapButonu;

   @FindBy(xpath = "//div[@class='_9ay7']") public WebElement girdiginSifreYanlis;





}

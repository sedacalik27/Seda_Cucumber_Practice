package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //kullanici Nutella icin arama yapar
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']") public WebElement aramaKutusu;


   // sonuclarin Nutella icerdigini test eder
    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']") public WebElement sonucYazisi;
}

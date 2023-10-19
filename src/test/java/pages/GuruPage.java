package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {
    public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }

    /*
     And "Company" basligi altindaki tum degerleri yazdirir bu stepin locatini alıcaz

     */

    @FindBy(xpath = "(//table)[2]//thead//th") public List<WebElement> sutunBasliklari;
    //birden fazla yani tüm başlıkları almak için list yaptık



}

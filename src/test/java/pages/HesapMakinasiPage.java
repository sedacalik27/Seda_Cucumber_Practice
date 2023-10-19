package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HesapMakinasiPage {

    public HesapMakinasiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //*[@class='btn btn-outline-warning']
    @FindBy (xpath = "//*[@class='btn btn-outline-warning']") public WebElement esittir;
    @FindBy (className = "screen") public WebElement ekran;
    @FindBy(xpath = "//*[@class='btn btn-outline-primary']") public List<WebElement> numbers;
    @FindBy(xpath = "//*[@class='operator btn btn-outline-success']") public List<WebElement> operators;










}

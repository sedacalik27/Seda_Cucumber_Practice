package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefination {
    GuruPage guruPage=new GuruPage();
    @And("{string} basligi altindaki tum degerleri yazdirir")
    public void basligiAltindakiTumDegerleriYazdirir(String istenenBaslik) {

        //bize company başlıgının indexi lazım
        int istenenSutunBaslikIndexi=0;

        for (int i = 0; i <guruPage.sutunBasliklari.size() ; i++) {
            if(guruPage.sutunBasliklari.get(i).getText().equals(istenenBaslik)){
                istenenSutunBaslikIndexi= i;
            }

        }

        //company başlıgının sutununun altındaki verileri vermesi için locati burda alıyorum
        //webtable da index 1 den başlar

        List<WebElement> sutunElementleri =
                Driver.getDriver().findElements(By.xpath("(//table)[2]//tbody//tr//td["+(istenenSutunBaslikIndexi+1)+"]"));


        for (WebElement each:sutunElementleri) {
            System.out.println(each.getText());
        }




    }
}

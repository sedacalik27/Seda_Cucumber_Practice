package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HesapMakinasiPage;

import java.util.Random;

public class HesapMakinesiStepdefs {
    @And("Hesap makinasından iki basamaklı random iki tane sayı seçelim ve random dort işlemden birini yaptıralım")
    public void hesapMakinasındanIkiBasamaklıRandomIkiTaneSayıSeçelimVeRandomDortIşlemdenBiriniYaptıralım() throws InterruptedException {
        HesapMakinasiPage page= new HesapMakinasiPage();
        Random rd=new Random();

        page.numbers.get(rd.nextInt(page.numbers.size()-1)).click();
        Thread.sleep(1000);
        page.numbers.get(rd.nextInt(page.numbers.size()-1)).click();
        Thread.sleep(1000);


        page.operators.get(rd.nextInt(page.operators.size()-1)).click();




    }

    @And("Sonucu konsola yazdırıp")
    public void sonucuKonsolaYazdırıp() {
    }

    @Then("Sonucun doğrulamasını yapalım")
    public void sonucunDoğrulamasınıYapalım() {
    }
}

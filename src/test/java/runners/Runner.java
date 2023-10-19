package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//senaryolarımızı burdan run etmek için
@RunWith(Cucumber.class) //notasyonu Runner class'ına calışma özelliği katar
                            //mvn de cucumber juniti runwithi kullanmak için ekledik


@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features", //FEATURE DOSYALARINI NEREDEN BULACAGINI TARİF EDER
        glue = "stepDefinitions", //STEP DEFİNİTİONS DOSYALARINI NEREDEN BULACAGINI TARİF EDER
        tags = "@Batch171" // HANGİ TAG'I CALISTIRMAK İSTİYORSAK O YAZILIR

        //and yazarsak iki tagında senaryo üzerinde olması lazım
        //or yazarsak yazdıgınız her iki senaryoyu çalıştırır
)


public class Runner {//rapor elde etmek için burda run et



}

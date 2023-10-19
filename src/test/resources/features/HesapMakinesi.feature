#https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html adresine gidelim
#Hesap makinasından 2 basamaklı random iki tane sayı seçelim ve random 4 işlemden birini yaptıralım
#Sonucu konsola yazdırıp
#Sonucun doğrulamasını yapalım



  Feature: Hesap Makinesi islemleri
    Scenario: Iki basamaklı sayilar ile islemler
      Given kullanici "hesapMakinesiUrl" anasayfasinda
      And Hesap makinasından iki basamaklı random iki tane sayı seçelim ve random dort işlemden birini yaptıralım
      And Sonucu konsola yazdırıp
      Then Sonucun doğrulamasını yapalım




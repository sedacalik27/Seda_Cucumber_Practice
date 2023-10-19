# uc Scenario olusturunuz

# kullanici amazon anasayfasinda
# kullanici Nutella icin arama yapar
# sonuclarin Nutella icerdigini test eder
# Sayfayı kapatir

# kullanici amazon anasayfasinda
# kullanici Java icin arama yapar
# sonuclarin Java icerdigini test eder
# Sayfayi kapatir

# kullanici amazon anasayfasinda
# kullanici iphone icin arama yapar
# sonuclarin iphone icerdigini test eder
# sayfayi kapatir


  Feature: US1001 Kullanici Amazon Sayfasında Arama Yapar

  @Nutella
    Scenario: TC01 kullanici amazonda nutella aratir

      Given kullanici amazon anasayfasinda
      Then kullanici Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And Sayfayi kapatir

  @vip
    Scenario: TC02 kullanici amazonda nutella aratir

      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And Sayfayi kapatir

   @iphone @TC03
    Scenario: TC03 kullanici amazonda nutella aratir

      Given kullanici amazon anasayfasinda
      Then kullanici iphone icin arama yapar
      And sonuclarin iphone icerdigini test eder
      And Sayfayi kapatir



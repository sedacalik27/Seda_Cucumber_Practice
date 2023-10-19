# Bir Scenario olusturunuz

# kullanici amazon anasayfasinda
# kullanici "Nutella" icin arama yapar
# sonuclarin "Nutella" icerdigini test eder
# Sayfayi kapatir

  Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

    Scenario: TC06 kullanici parametre ile amazonda arama yapar
      Given kullanici amazon anasayfasinda
      Then kullanici "Nutella" icin arama yapar
      And sonuclarin "Nutella" icerdigini test eder
      And Sayfayi kapatir
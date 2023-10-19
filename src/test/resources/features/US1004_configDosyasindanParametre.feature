
# Bir Scenario olusturunuz

# kullanici "amazonUrl" anasayfasinda
# kullanici 3 sn bekler
# url'in "amazon" icerdigini test eder
# Sayfayi kapatir



  Feature:  US1004 Kullanici parametre ile configuration file'i kullanabilmeli

    Scenario: TC007 configuration properties dosyasindan parametre kullanimi
      Given kullanici "amazonUrl" anasayfasinda
      Then kullanici 3 sn bekler
      And url'in "amazon" icerdigini test eder
      And Sayfayi kapatir



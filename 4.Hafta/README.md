
## İstenenler:

![](https://github.com/nurbanuogur/NesneYonelimliAnalizTasarim/blob/master/Diyagramlar/Uygulama4.png)

* Kisi ve Adres sınıfları içerisine tamsayı tipli id üyeleri eklenmelidir.
* Bu sınıfların yapıcı ve toString yöntemlerini, id değerlerini göz önüne alacak şekilde değiştirilmelidir.
* Uygulama sınıfının main yöntemi içerisinde aşağıda belirtilen işlemleri yapılmalı:
 	* “Kisi” verilerini saklayacak dinamik dizi oluşturulmalıdır.
 	* 100 tekrarlı bir döngü oluşturulmalı (1-100).
 	* Tekrarlı yapı içerisinde:
 		* ev adresi nesnesi oluşturunuz (bu nesnenin id değeri döngü değişkeninden, adresSatiri değeri “RastgeleUretmeAraci.rastgeleKelimeUret(5)” yönteminden alınmalıdır, il bilgisi olarak “Doğduğunuz İl” atanmalıdır).
 		* Döngü değişkeninin tek değerleri için:
 			* ev adresine benzer şekilde iş adresi oluşturulmalı.
 			* Yeni müşteri oluşturulmalı (bu nesnenin id değeri döngü değişkeninden, ….)
 			* Müşteri nesnesi dinamik dizi içerisine eklenmelidir.
 		* Döngü değişkeninin çift değerleri için:
 			* Personel nesnesi oluşturulmalı (bu nesnenin id değeri döngü değişkeninden, ….) ve dinamik dizi içerisine eklenmelidir.
 			
 	* Dinamik dizideki nesnelere döngü ile erişiniz ve tüm nesneleri aşağıdaki çıktıyı verecek şekilde yazdırınız. Çıktı için nesnelerin toString() yöntemlerinde gereken düzenlemeleri yapılmalıdır.
 	
Personel-->1,voige,Doğduğunuzİl,yhtfk
Müşteri-->2,qblym,Doğduğunuzİl,lytgb,Sakarya
Personel-->3,wqpja,Doğduğunuzİl,vgflm
Müşteri-->4,wwnkk,Doğduğunuzİl,hixtp,Sakarya
Personel-->5,mrjce,Doğduğunuzİl,owcxg
Müşteri-->6,rrbbf,Doğduğunuzİl,egsgq,Sakarya

 	
 	

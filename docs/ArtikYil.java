import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
         
        // Kullanıcıdan yıl bilgisini al
        Scanner sc = new Scanner(System.in); //İlk olarak, kullanıcının girdiği yılı almak için bir Scanner nesnesi oluşturalım:
        System.out.print("Lütfen bir yıl giriniz: ");
        int yil = sc.nextInt();

      /* Artık yılın tanımını hatırlayalım: 4'e tam bölünebilen yıllar genellikle artık yıldır. 
        Ancak, 100'e tam bölünebilen yılların sadece 400'e tam bölünebilenler artık yıldır. 
       Buna göre, yılın artık olup olmadığını kontrol etmek için aşağıdaki koşulu kullanabiliriz:      
      */
        // artık yıl hesaplama
        boolean artik = false;
        if(yil % 4 == 0) {
            if( yil % 100 == 0) {
                // Yalnızca yüzyıl olanlar kontrol edilir
                if ( yil % 400 == 0) {
                    artik = true;
                }
            }
            else {
                artik = true;
            }
        }

        // Sonucu yazdır
        if(artik) {
            System.out.println(yil + " bir artık yıldır.");
        }
        else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}


/*

Bu koşul, ilk olarak yılın 4'e tam bölünebiliyor olması gerektiğini kontrol eder. 
Bu doğruysa, ayrıca yılın 100'e tam bölünememesi de gerektiğini kontrol eder (yani, yılın 100'e tam bölünebilmesi durumunda artık yıl olmaması). 
Ancak, yıl 400'e tam bölünebiliyorsa, o zaman artık bir yıl olarak kabul edilir.

*/


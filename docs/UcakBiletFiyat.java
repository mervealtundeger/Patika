import java.util.Scanner;

    /*
    Bu program, kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alacak ve aldığı bu bilgilere göre uçak biletinin toplam ücretini hesaplayacak. 
    Buna ek olarak aşağıdaki indirimleri uygulayacak:

- Kullanıcının yaş değeri 12'den küçükse, bilet fiyatı üzerinden %50 indirimi uygulanacak.
- Kullanıcının yaş değeri 12-24 arasında ise, bilet fiyatı üzerinden %10 indirimi uygulanacak.
- Kullanıcının yaş değeri 65'ten büyükse, bilet fiyatı üzerinden %30 indirim uygulanacak.
- Kullanıcının yolculuk tipi gidiş dönüş seçmişse, bilet fiyatı üzerinden %20 indirim uygulanacak.
Kullanıcıdan alınan değerler doğru değilse, program kullanıcıya "Hatalı veri girdiniz!" şeklinde bir uyarı verecek. 
Başlamak için, ilk olarak kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alınacaktır. 
Mesafe değeri girildikten sonra, program mesafeyi 0,10 TL / km oranında çarpacak ve toplam fiyatı hesaplayacaktır.
Sonrasında, kullanıcının yaş değeri kontrol edilecek ve ilgili indirimler bilet fiyatına uygulanacaktır. 
Yolculuk tipi de kontrol edilecek ve ilgili indirim bu bilgiye göre uygulanacaktır.
Eğer kullanıcının girdiği veri doğru değilse, program kullanıcıya bir uyarı mesajı verecek ve programı yeniden başlatması gerekecek.
    
    
    */
public class UcakBiletiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mesafe, ucret, toplamFiyat, indirimliFiyat;
        int yas, yolculukTipi;

        System.out.print("Lütfen mesafeyi (km) giriniz: ");
        mesafe = scanner.nextDouble();
        if (mesafe <= 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        ucret = mesafe * 0.1;
        toplamFiyat = ucret;

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = scanner.nextInt();
        if (yas < 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        System.out.print("Lütfen yolculuk tipini seçiniz (1 - Tek Yön, 2 - Gidiş Dönüş): ");
        yolculukTipi = scanner.nextInt();
        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        if (yas < 12) {
            indirimliFiyat = toplamFiyat * 0.5;
            toplamFiyat -= indirimliFiyat;
        } else if (yas >= 12 && yas <= 24) {
            indirimliFiyat = toplamFiyat * 0.1;
            toplamFiyat -= indirimliFiyat;
        } else if (yas >= 65) {
            indirimliFiyat = toplamFiyat * 0;
            toplamFiyat -= indirimliFiyat;
        }

        if (yolculukTipi == 2) {
            indirimliFiyat = toplamFiyat * 0.2;
            toplamFiyat -= indirimliFiyat;
        }

        System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
    }
}




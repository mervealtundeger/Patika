//Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı
import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
        double girilenTutar, kdvOrani, kdvTutari, kdvliFiyat, kdvsizFiyat;
        Scanner scanner = new Scanner(System.in); //Scanner sınıfı kullanarak kullanıcıdan bir fiyat alınır. 
        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        girilenTutar = scanner.nextDouble();
        
        if(girilenTutar > 0 && girilenTutar <= 1000) { //girilen fiyat 0'dan büyük ve eşit mi, 1000'den küçük veya eşit mi, yoksa 1000'den büyük mü diye kontrol edilir
            kdvOrani = 0.18; //Bu kontrollere göre kdvOrani belirlenir
        } else {
            kdvOrani = 0.08;
        }
        //kdvTutari değişkenleri belirlenir ve hesaplanır
        kdvsizFiyat = girilenTutar;
        kdvTutari = kdvsizFiyat * kdvOrani;
        kdvliFiyat = kdvsizFiyat + kdvTutari;
        //print edilir
        System.out.println("KDV'siz fiyat: " + kdvsizFiyat);
        System.out.println("KDV oranı: " + (kdvOrani*100) + "%");
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    /*
    (Not : KDV tutarını 18% olarak alındı)  
    KDV'siz Fiyat = 10;  
    KDV'li Fiyat = 11.8;  
    KDV tutarı = 1.8;  
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program.
    
    */
    
    }

}


import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
        double girilenTutar, kdvOrani, kdvTutari, kdvliFiyat, kdvsizFiyat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        girilenTutar = scanner.nextDouble();
        
        if(girilenTutar > 0 && girilenTutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }
        
        kdvsizFiyat = girilenTutar;
        kdvTutari = kdvsizFiyat * kdvOrani;
        kdvliFiyat = kdvsizFiyat + kdvTutari;
        
        System.out.println("KDV'siz fiyat: " + kdvsizFiyat);
        System.out.println("KDV oranı: " + (kdvOrani*100) + "%");
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program.  
    (Not : KDV tutarını 18% olarak alındı)  
    KDV'siz Fiyat = 10;  
    KDV'li Fiyat = 11.8;  
    KDV tutarı = 1.8;  
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program.
    
    */
    
    }

}


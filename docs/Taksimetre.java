//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe, tutar;
        System.out.print("Gidilen mesafe (km): "); // İlk olarak, kullanıcıdan mesafe bilgisi alınır ve "mesafe" adlı değişkene atanır. 
        mesafe = input.nextDouble();
        
        tutar = mesafe * 2.20 + 10.0; // taksimetre açılış ücreti
        
        if (tutar < 20.0) {
            tutar = 20.0; // minimum ödenecek tutar
        }
        
        System.out.printf("Tutar: %.2f TL", tutar); //hesaplanan tutar ekrana yazdırılır
        input.close();
    
    
    
    /*
    Kullanıcıdan mesafeyi (km cinsinden) alır ve taksimetre tutarını hesaplar. 
    Taksimetre ücreti km başına 2.20 TL'dir ve açılış ücreti 10 TL'dir. 
    Minimum ödenecek tutar 20 TL'dir. Eğer hesaplanan tutar 20 TL'den küçükse, yine 20 TL alınır. 
    Son olarak, hesaplanan tutar ekrana 2 ondalık basamağa kadar yazdırılır.
    
    */
    
    }
}


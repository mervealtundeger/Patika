//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan program
import java.util.Scanner; //Scanner sınıfı kullanabilmek için gerekli kütüphaneyi ekler

public class RecursivePower { //RecursivePower adlı bir sınıf tanımladık

    public static void main(String[] args) { //Programın başlatıldığı ana metodu tanımladık
        Scanner input = new Scanner(System.in); //Kullanıcıdan girdi almak için yeni bir Scanner nesnesi oluşturduk
        System.out.print("Taban: ");  //Kullanıcıya taban değerini girmesi için bir mesaj yazdırdık
        int base = input.nextInt();   //Kullanıcının girdiği taban değerini okuduk
        System.out.print("Üs: ");    //Kullanıcıya üs değerini girmesi için bir mesaj yazdırdık
        int power = input.nextInt(); //Kullanıcının girdiği üs değerini okuduk
        int result = power(base, power); //power fonksiyonunu kullanarak tabanın üs ile çarpımını hesaplar and sonucu bir değişkene atadık
        System.out.println(base + "^" + power + " = " + result); //Sonucu kullanıcıya göstermek için bir mesaj yazdırdık
    }

    public static int power(int base, int power) { //Recursive olarak çalışacak olan power adlı metodu tanımladık
        if (power == 0) { //Özel durum olarak üssüz tabanın sonucunun 1 olduğunu belirttik
            return 1;
        } else {
            return base * power(base, power - 1); // Tabanın üs ile çarpımını hesaplar ve üs değerini 1 azaltarak kendini çağırdık
        }
    /*
    kullanıcıdan taban ve üs değerlerini alır ve bu değerleri kullanarak üs alma işlemini gerçekleştirir. 
    power adlı recursive metod, tabanın üs ile çarpımını hesaplar ve ardından üs değerini 1 azaltarak kendini çağırır. 
    Fonksiyon, üssüz tabanın 1 olduğu özel bir durumda sonuç olarak 1 döndürür.
    */
    }
}


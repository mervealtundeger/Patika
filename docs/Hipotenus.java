//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Birinci Kenar : "); //Birinci kenar uzunlugunu giriyoruz
        a = scanner.nextInt();
        System.out.print("İkinci Kenar : "); //İkinci kenar uzunluğunu giriyoruz
        b = scanner.nextInt();
        
        double h = Math.sqrt(a * a + b * b); //a^2 + b^2 (Pythagoras teoremi)
        System.out.println("Hipotenüs : " + h); //Ekrana hipotenüsü yazırıyoruz
/*
`Scanner` sınıfı kullanıcı tarafından veri girişi yapmak için kullanılır. 
Okunan kenar uzunlukları bir değişkene atanır ve ardından kareleri alınarak hipotenüs hesaplanır. 
Daha sonra, hipotenüs ekrana yazdırılır.
*/
        
    }
}

/* --------------------------------ODEV-------------------------------------------- */
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program
import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. kenar uzunluğunu giriniz: "); //Birinci kenar uzunlugunu giriyoruz
        double kenar1 = input.nextDouble();
        
        System.out.print("2. kenar uzunluğunu giriniz: "); //İkinci kenar uzunluğunu giriyoruz
        double kenar2 = input.nextDouble();
        
        System.out.print("3. kenar uzunluğunu giriniz: "); //Üçüncü kenar uzunluğunu giriyoruz.
        double kenar3 = input.nextDouble();
        
        double u = (kenar1 + kenar2 + kenar3) / 2;  //𝑢 = (a+b+c) / 2
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3)); //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        
        System.out.println("Üçgenin alanı: " + alan); //Üçgenin alanını ekrana yazdırdık
    }
}

/*
Bilinen üç kenar uzunluğu temelinde bir üçgenin alanını hesaplar. 
`Scanner` sınıfı kullanıcı tarafından veri girişi yapmak için kullanılır. 
Okunan kenar uzunlukları bir değişkene atanır ve ardından üçgenin yarı çevresi hesaplanır. 
Daha sonra, üçgenin alanı hesaplanır ve ekrana yazdırılır.

*/

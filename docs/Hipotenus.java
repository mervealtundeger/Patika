import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Birinci Kenar : ");
        a = scanner.nextInt();
        System.out.print("İkinci Kenar : ");
        b = scanner.nextInt();
        
        double h = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs : " + h);
      /* 
      Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan program.
      */
        
    }
}

/* --------------------------------ODEV-------------------------------------------- */

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. kenar uzunluğunu giriniz: ");
        double kenar1 = input.nextDouble();
        
        System.out.print("2. kenar uzunluğunu giriniz: ");
        double kenar2 = input.nextDouble();
        
        System.out.print("3. kenar uzunluğunu giriniz: ");
        double kenar3 = input.nextDouble();
        
        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        
        System.out.println("Üçgenin alanı: " + alan);
    }
}

/*
Bilinen üç kenar uzunluğu temelinde bir üçgenin alanını hesaplar. 
`Scanner` sınıfı kullanıcı tarafından veri girişi yapmak için kullanılır. 
Okunan kenar uzunlukları bir değişkene atanır ve ardından üçgenin yarı çevresi hesaplanır. 
Daha sonra, üçgenin alanı hesaplanır ve ekrana yazdırılır.

*/

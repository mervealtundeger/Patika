/*
Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
*/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c; //0 ve 1 numaralı Fibonacci sayıları (a ve b değişkenleri) elde edilir
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi hesaplanacak? ");
        n = sc.nextInt(); 
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) { //döngü n sayısı kadar çalıştırılır ve c değişkeni kullanılarak her bir Fibonacci sayısı hesaplanır
            c = a + b;
            System.out.print(" " + c);
          //Döngü sırasında a ve b değişkenleri güncellenir ve sonuçlar ekrana yazdırılır.  
          a = b;
            b = c;
        }
        sc.close();
    }
}




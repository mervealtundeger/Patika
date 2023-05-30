//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program

import java.util.Scanner;

public class AsalSayiRecursive {

    public static void main(String[] args) {
        //Kullanıcıdan sayı alınıyor
        Scanner giris = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = giris.nextInt();

        // asalSayiRecursive metodu çağrılıyor
        if (asalSayiRecursive(sayi, sayi-1) == true) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

    public static boolean asalSayiRecursive(int sayi, int bolunecekSayi) {

        if (bolunecekSayi == 1) {
            // eğer bolunecekSayi 1 ise, sayı asal olduğundan 
            // true döndürülüyor
            return true;
        } else {
            if (sayi % bolunecekSayi == 0) {
                // eğer sayı bolunecekSayi'ye tam bölünüyorsa,
                // sayı asal değildir, false döndürülüyor
                return false;
            } else {
                // aksi halde metod kendi kendisini çağırarak 
                // bolunecekSayi'yi azaltıyor
                return asalSayiRecursive(sayi, bolunecekSayi-1);
            }
        }
      
      /*      
      Bu programda, kullanıcıdan bir sayı alınarak asalSayiRecursive adlı metod çağrılıyor. 
      Bu metod, aldığı iki parametre ile sayının asal olup olmadığını kontrol ediyor. 
      Eğer bolunecekSayi parametresi 1 ise, sayı asal olduğundan true döndürüyor. 
      Eğer sayı bolunecekSayi'ye tam bölünüyorsa, sayının asal olmadığı anlaşıldığı için false döndürüyor. 
      Eğer asal olma durumu bu iki koşulu da karşılamıyorsa, metod kendi kendisini çağırarak bolunecekSayi'yi azaltıyor ve işlemler tekrar baştan başlıyor. 
      Asal sayı olup olmadığını kontrol eden metod, `main` metodunda çağrıldıktan sonra sonuç ekrana yazdırılıyor.
      */
    }
}


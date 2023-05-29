
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        int n = input.nextInt();
        
        for (int i = n; i >= 1; i--) { // i değişkeni basamak sayısından başlayarak azalacak şekilde döngü yapısı oluşturduk
            for (int j = 1; j <= i; j++) { // j değişkeni ise i değişkeninin değeri kadar yıldız yazdırılacak şekilde iç içe bir döngü yapısı oluşturduk
                System.out.print("* ");
            }
            System.out.println(); // bir satır atlamak için println kullanıyoruz
        }
        input.close();
    }
}

/*
Porgram:
- `Scanner` sınıfını kullanarak kullanıcıdan bir tamsayı (basamak sayısı) istiyoruz.
- İlk döngü yapısmızda `i` adındaki değişkenimiz basamak sayısından başlayarak azalmakta. Her bir azalmaya karşılık olarak, ikinci döngü yapımızda `j` adındaki değişkenimiz, `i` kadar yıldız (*) yazdırıyor.
- Döngülerimiz tamamlandığında, `input.close()` komutunu kullanarak kullanıcı girdisini kapatıyoruz. 
- Bu program çalıştırıldığında, kullanıcıdan alınan sayıya göre ekrana ters üçgen çizdirir.
*/

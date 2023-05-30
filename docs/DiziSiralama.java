//Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alan program
import java.util.Arrays;
import java.util.Scanner;

public class SiralamaProgrami {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dizinin boyutunu girin: ");
        int boyut = scan.nextInt();

        int[] dizi = new int[boyut]; // Kullanıcının girdiği boyutta bir dizi oluşturuldu
        System.out.println("Dizinin elemanlarını girin:");

        // Dizi elemanları kullanıcıdan alınıyor
        for (int i = 0; i < boyut; i++) {
            System.out.print((i+1) + ". elemanı girin: ");
            dizi[i] = scan.nextInt();
        }

        // Dizi elemanları küçükten büyüğe sıralanıyor
        Arrays.sort(dizi);

        // Sıralanmış dizi ekrana yazdırılıyor
        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(dizi));
    }
}


  /*
İlk olarak, programda Scanner ve Arrays kütüphaneleri çağırılıyor.
main fonksiyonu içinde, öncelikle bir Scanner nesnesi oluşturuluyor. 
Bu sayede, kullanıcının dizi boyutunu ve elemanlarını girmesi için programımız giriş bekleyebilir hale geliyor.
Kullanıcıdan dizi boyutunu integer olarak girmesi isteniyor ve bu değer 'boyut' değişkenine atanıyor.
boyut değerini kullanarak yeni bir int tipinde 'dizi' dizisi oluşturuyoruz.
Şimdi, kullanıcıdan sırasıyla her dizi elemanını girmesi istenir.
Döngü işlemi için ben bir for döngüsü kullandım. Dizi elemanlarını kullanıcının girebilmesi için, for döngüsü içinde bir System.out.println() yazdım.
Bu sayede kullanıcı girdiği elemanı kontrol edebilir.
Kullanıcı tarafından girilen dizi elemanları dizi dizisine aktarılıyor.
Daha önce import ettiğimiz Arrays kütüphanesindeki sort metodunu kullanarak dizi dizisi sıralanıyor.
Sonucu görebilmek için sıralanmış dizi ekrana yazdırılıyor.
  */
}


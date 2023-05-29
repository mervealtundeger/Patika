//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan program
import java.util.Scanner; //kodu, kullanıcının konsoldan girdiği verileri programda kullanmak için Scanner sınıfını içe aktarır

public class NotOrtalamasi { //kodu, Java programının bir sınıf olduğunu ve bu programın "NotOrtalamasi" olarak adlandırıldığını belirtir
    public static void main(String[] args) { //kodu, Java programının "main" methodunu tanımlar, yani programın çalıştırılacağı ana methodu
        Scanner input = new Scanner(System.in); // kodu, yeni bir Scanner nesnesi oluşturarak, kullanıcının konsoldan girdiği verileri almak için "input" adlı değişkene atar
        //kod, kullanıcıya M-F-K-T-T-M sınav puanını girmesi için konsolda bir mesaj gösterir
        System.out.println("Matematik sınav puanını girin:");
        int matematik = input.nextInt(); //kodu, kullanıcının konsoldan girdiği tam sayıyı "matematik" değişkenine atar

        System.out.println("Fizik sınav puanını girin:");
        int fizik = input.nextInt();//kodu, kullanıcının konsoldan girdiği tam sayıyı "fizik " değişkenine atar

        System.out.println("Kimya sınav puanını girin:");
        int kimya = input.nextInt();//kodu, kullanıcının konsoldan girdiği tam sayıyı "kimya " değişkenine atar

        System.out.println("Türkçe sınav puanını girin:");
        int turkce = input.nextInt();//kodu, kullanıcının konsoldan girdiği tam sayıyı "Türkçe " değişkenine atar

        System.out.println("Tarih sınav puanını girin:");
        int tarih = input.nextInt();//kodu, kullanıcının konsoldan girdiği tam sayıyı "tarih " değişkenine atar

        System.out.println("Müzik sınav puanını girin:");
        int muzik = input.nextInt();//kodu, kullanıcının konsoldan girdiği tam sayıyı "müzik " değişkenine atar

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik; //kodu, toplam değişkeniyle, kullanıcının girdiği her bir nota ait değişkeni toplar
        double ortalama = toplam / 6.0; // kodu, notların toplamını alarak notların ortalamasını hesaplar

        System.out.println("Ortalama: " + ortalama); //kodu, hesaplanan not ortalamasını ekrana yazdırır

        String sinifDurumu = (ortalama > 60) ? "sınıfı geçti" : "sınıfta kaldı"; // not ortalamasına göre, öğrencinin sınıfı geçip geçmediğini belirler
        System.out.println(sinifDurumu); //öğrencinin sınıfı geçip geçmediğini ekrana yazdırır

        input.close(); //Scanner nesnesinin konsoldan girdiği verileri okumayı bırakmasını sağlar ve programın kapanmasını tamamlar
    }
}
/*
Bu kod, kullanıcının altı farklı ders için sınav puanlarını girmesini ve ardından bu puanların ortalamasını hesaplamasını sağlar. 
Daha sonra, koşullu bir ifade kullanılarak (if-else olmadan), kullanıcının sınıfı geçip geçmediği kontrol edilir ve sonuçlar ekrana yazdırılır. 

*/


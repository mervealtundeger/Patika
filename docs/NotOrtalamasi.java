import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik sınav puanını girin:");
        int matematik = input.nextInt();

        System.out.println("Fizik sınav puanını girin:");
        int fizik = input.nextInt();

        System.out.println("Kimya sınav puanını girin:");
        int kimya = input.nextInt();

        System.out.println("Türkçe sınav puanını girin:");
        int turkce = input.nextInt();

        System.out.println("Tarih sınav puanını girin:");
        int tarih = input.nextInt();

        System.out.println("Müzik sınav puanını girin:");
        int muzik = input.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        System.out.println("Ortalama: " + ortalama);

        String sinifDurumu = (ortalama > 60) ? "sınıfı geçti" : "sınıfta kaldı";
        System.out.println(sinifDurumu);

        input.close();
    }
}
/*
Bu kod, kullanıcının altı farklı ders için sınav puanlarını girmesini ve ardından bu puanların ortalamasını hesaplamasını sağlar. 
Daha sonra, koşullu bir ifade kullanılarak (if-else olmadan), kullanıcının sınıfı geçip geçmediği kontrol edilir ve sonuçlar ekrana yazdırılır. 

*/


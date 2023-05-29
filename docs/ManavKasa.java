 /*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //İlk olarak, Scanner sınıfı kullanılarak kullanıcıdan alınacak verileri almak için bir nesne oluşturdum
        //Sonra, her bir ürün için kilogram başına fiyatları değişkenlere atadım
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;
        //Kullanıcıdan kaç kilo alınacak diye sorulur ve kullanıcı tarafından girilen değerler değişkenlere atanır
        System.out.print("Kaç kilo armut aldınız? ");
        double armutKilosu = scanner.nextDouble();
        System.out.print("Kaç kilo elma aldınız? ");
        double elmaKilosu = scanner.nextDouble();
        System.out.print("Kaç kilo domates aldınız? ");
        double domatesKilosu = scanner.nextDouble();
        System.out.print("Kaç kilo muz aldınız? ");
        double muzKilosu = scanner.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? ");
        double patlicanKilosu = scanner.nextDouble();
        //En son olarak, toplam tutar hesaplanır
        double toplamTutar = armutFiyati * armutKilosu + 
                            elmaFiyati * elmaKilosu +
                            domatesFiyati * domatesKilosu +
                            muzFiyati * muzKilosu +
                            patlicanFiyati * patlicanKilosu;
       //ekrana yazdırılır 
        System.out.printf("Toplam tutar: %.2f TL", toplamTutar);
    }
}


//Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulan program
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Kilonuzu lütfen kg cinsinden girin:"); //Kullanıcıdan kilo(kg) değerini girmesini istiyoruz
         int kilo = scanner.nextInt(); //bir değişkene atıyoruz
         System.out.print("Boyunuzu lütefen metre cinsinden girin:"); //Kullanıcıdan boy(m) değerini girmesini istiyoruz
         double boy = scanner.nextDouble(); //bir değişkene atıyoruz
         
         double bki = kilo / (boy * boy); //formül--> Kilo (kg) / Boy(m) * Boy(m)
         
         System.out.println("Beden Kitle Indeksiniz : " + bki); //Ekrana bki yazdırıyoruz
         

        
    }
}

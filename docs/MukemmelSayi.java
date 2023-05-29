//Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan program
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        // Klavyeden girilen sayıyı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();

        // sayının tam bölenlerini hesapla
        int sum = 0;
        for(int i=1;i<number;i++){
            if(number%i == 0){
                sum += i;
            }
        }

        // toplam tam bölenlerin sayıya eşitliğini kontrol et
        if(number == sum){
            System.out.println(number + " mükemmel sayıdır.");
        }else{
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}

/*

Kodun çalışma mantığı şöyle:
- Kullanıcıdan bir sayı alınır.
- Sayının tam bölenleri hesaplanır ve toplamı bulunur.
- Sayı, tam bölenlerinin toplamına eşitse ekrana "mükemmel sayıdır." yazısı yazdırılır. Eşit değilse "mükemmel sayı değildir." yazısı yazdırılır. 
Yani mükemmel sayılar, kendileri dışındaki tam bölenlerinin toplamına eşit olan sayılardır.

*/

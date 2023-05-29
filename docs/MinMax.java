//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        İlk olarak kullanıcıdan kaç tane sayı gireceğini belirlemesi için bir girdi istenir. 
        Bu girdi, "n" değişkeni olarak adlandırılır ve int türünde olduğu için Integer.parseInt() yöntemi kullanarak tam sayıya dönüştürülür.
        */
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = Integer.parseInt(scanner.nextLine());
      //n adet sayıyı saklamak için bir dizi tanımlanır. Bu dizi, "numbers" olarak adlandırılır ve n uzunluğunda olur.
        int[] numbers = new int[n];
      /*
      Bir döngü oluşturulur ve n adet dizi elemanı almak için klavyeden girilen sayılardan istifade edilir. 
      Bu döngü, 0'dan başlayarak n-1'e kadar endekslenir ve her turda bir sayı girilmesi için kullanıcıya bir girdi istenir ve o sayı numbers dizisinin ilgili endeksine atanır.
      */
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". sayıyı giriniz: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
      
      //En büyük ve en küçük sayıları belirlemek için iki değişken tanımlanır; "max" ve "min". İlk başta, bu iki değişken de sayı dizisinin ilk elemanına atanır.
        int max = numbers[0];
        int min = numbers[0];
      /*
       bir döngü daha oluşturulur ve bu döngüde tüm sayılar tek tek kontrol edilir.
       Eğer sayı max değişkenindeki sayıdan büyükse, max bu sayı ile değiştirilir.
       Eğer sayı min değişkenindeki sayıdan küçükse, min bu sayı ile değiştirilir.
       */
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] < min)
                min = numbers[i];
        }
        //Son olarak, en büyük ve en küçük sayılar yazdırılır.
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}


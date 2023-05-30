//Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program 

import java.util.Scanner;

public class Palindrome {

   public static void main(String[] args) {

      // kullanıcıdan kelimeyi al
      Scanner scanner = new Scanner(System.in);
      System.out.println("Bir kelime girin: ");
      String kelime = scanner.nextLine();


      // kelimeyi tersine çevir
      String tersKelime = "";
      int uzunluk = kelime.length();

      for ( int i = uzunluk - 1; i >= 0; i-- )
         tersKelime = tersKelime + kelime.charAt(i);

      // palindromik kontrolü yap
      if (kelime.equals(tersKelime))
         System.out.println(kelime + " kelimesi palindromiktir.");
      else
         System.out.println(kelime + " kelimesi palindromik değildir.");

     /*
     
     Kullanıcının girdiği kelimeyi aldıktan sonra, bu kelimeyi palindromik olup olmadığına göre kontrol etmeliyiz. 
     Bir kelimenin palindromik olması demek, o kelimenin sağdan sola da soldan sağa da aynı şekilde okunabilmesi demektir. 
     Örneğin "kayak" kelimesi palindromiktir, çünkü sağdan sola da sola sağa da aynı şekilde okunabilir. 
     Bu kontrolü yapmak için, kelimeyi tersine çevirip asıl kelimeyle karşılaştıracağız. 
     Eğer bu iki kelime aynıysa, kelimenin palindromik olduğunu söyleyebiliriz.
     ilk olarak kelimeyi tersine çevirmek için bir boş string değeri olan "tersKelime" değişkeni tanımladık.
     Daha sonra kelime uzunluğu alınarak sağdan sola doğru tüm harfleri tek tek alınır ve tersKelime değişkenine ekledik.
     Bu işlemi for döngüsü ile gerçekleştirdik.
     Sonrasında, kelime ile tersKelime değişkenleri karşılaştırdık ve eğer aynıysa, kelimenin palindromik olduğu söyledik.
     Eğer farklıysa, kelimenin palindromik olmadığı söyledik.     
     
     */
   }
}


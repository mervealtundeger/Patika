//Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazımı

/*Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/
public class Main {
  
  public static void recursiveMethod(int num) {
    System.out.println("Girilen sayı: " + num); //girilen sayı ekrana yazdırılır
    if (num <= 0) { //Eğer sayı negatif veya sıfıra eşitse, tekrar 5 eklenir ve en son değer ekrana yazdırılır
      num += 5;
      System.out.println("Negatif veya 0 olduğu için tekrar 5 eklendi: " + num); 
      return;
    } else { //Eğer sayı pozitif ise, 5 çıkarılır ve bu işlem recursiveMethod() metodu içinde tekrarlanır
      num -= 5;
      System.out.println("5 çıkarıldı: " + num); 
      recursiveMethod(num);
      num += 5; //En son sayıya tekrar 5 eklenir ve son değer ekrana yazdırılır
      System.out.println("5 eklendi: " + num);
    }
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir sayı girin: "); //sayı girişi yapılması istenir
    int n = scanner.nextInt();
    recursiveMethod(n);
  }
}

/*
Bu kodda, recursiveMethod() adlı metot, parametre olarak alınan num değişkenine göre yukarıda belirtilen kurala uyan şekilde işlem yapmaktadır. 
İlk önce girilen sayı ekrana yazdırılır. Eğer sayı negatif veya sıfıra eşitse, tekrar 5 eklenir ve en son değer ekrana yazdırılır. 
Eğer sayı pozitif ise, 5 çıkarılır ve bu işlem recursiveMethod() metodu içinde tekrarlanır. En son sayıya tekrar 5 eklenir ve son değer ekrana yazdırılır. 
Main() metodu içinde kullanıcıdan alınan n değeri recursiveMethod() metodu çağrılarak işlem yapılır.
*/

/*
1'den 100'e kadar olan sayıları kontrol eder ve hangilerinin asal olduğunu ekrana yazdırır. 
Asal sayılar, sadece kendilerine ve 1'e bölünebilen sayılardır.
*/
public class AsalSayilar {

    public static void main(String[] args) {

        int i = 0, j = 0, flag = 0; // Başlangıçta, i = 0, j = 0 ve flag = 0 olarak tanımlanır.

        System.out.println("1 - 100 arasındaki asal sayılar:");//Ekrana "1 - 100 arasındaki asal sayılar:" yazdırılır.

        for (i = 1; i <= 100; i++) { //Bir for döngüsü kullanarak, 1'den 100'e kadar olan sayıları kontrol eder. Döngü değişkeni i, 1'den 100'e kadar artar.
            flag = 0;

            for (j = 2; j <= i / 2; j++) {// İçteki for döngüsü, her bir i değeri için, i/2'ye kadar olan sayılarla bölünerek asal olup olmadığını kontrol eder. Döngü değişkeni j, 2'den i/2'ye kadar artar.
                if (i % j == 0) { // Eğer i, j'ye bölündüğünde kalan sıfır ise, o zaman flag = 1 olur ve içteki for döngüsünden çıkılır.
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && i != 1) { //- Eğer flag hala sıfırsa ve i 1'e eşit değilse, o zaman i asaldır ve ekrana yazdırılır.
                System.out.print(i + " ");
            }
        
        }
    }
}


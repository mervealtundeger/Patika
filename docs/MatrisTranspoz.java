//Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan program

import java.util.Scanner;

public class MatrisTranspose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner sınıfı kullanarak kullanıcıdan matrisin boyutunu alıyoruz

        System.out.println("Matrisin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        int[][] matris = new int[boyut][boyut]; //Kullanıcının girdiği boyuta göre 2 boyutlu bir matris oluşturuyoruz

        System.out.println("Matrisin elemanlarını giriniz: "); //Kullanıcıdan matrisin elemanlarını girmesi isteniyor
      //Bu döngüler aracılığıyla kullanıcının girdiği elemanlar matrisin içine yerleştiriliyor
      for (int i = 0; i < boyut; i++) { 
            for (int j = 0; j < boyut; j++) {
                matris[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matris: "); //Ekrana girilen matris yazdırılıyor
        for (int[] row : matris) {
            for (int i : row) {
                System.out.print(i + " "); 
            }
            System.out.println();
        }

        int[][] transpose = new int[boyut][boyut]; //MatrisTranspose sınıfında yeni bir "transpose" adlı 2 boyutlu bir matris oluşturuyoruz
        //Transpoz işlemi, matrisin satırları ile sütunlarının yerlerinin değiştirilmesini gerektirir
       //içinde i ve j döngüsü olan for döngüleriyle önce matrisin satırlarını sütunlarına yerleştiriyoruz  
      for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                transpose[j][i] = matris[i][j];
            }
        }
       //yeni matris olarak oluşturduğumuz transpoz matrisini ekrana yazdırıyoruz
        System.out.println("Transpoze: ");
        for (int[] row : transpose) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
/*
Transpoz işlemi, bir matrisin satırları ile sütunlarının yerlerinin değiştirilerek yeni bir matris oluşturulmasıdır. Matrisin T harfi ile gösterilir.
Örneğin aşağıdaki matrisin transpozu alındığında, satırları ile sütunlarının yerleri değiştiği için yeni matris oluşur.

1 2 3       1 4 7
4 5 6   ->  2 5 8
7 8 9       3 6 9

*/
}


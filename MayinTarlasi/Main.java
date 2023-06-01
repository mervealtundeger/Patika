//Java dilinde Mayın Tarlası oyunu
import java.util.Scanner; // java.util paketinden Scanner sınıfını içeri aktardık

public class Main {  // Main adında bir sınıf oluşturduk, bu sınıfın erişim düzenleyicisi public'dir
    public static void main(String[] args) { //programın başlatılacağı ana metot (main) oluşturduk
        Scanner scanner = new Scanner(System.in); // kullanıcıdan giriş almak için Scanner sınıfının bir örneği oluşturduk
        System.out.print("Satir sayisini giriniz: "); // kullanıcıya kaç satırlık bir oyun istediğini sorduk
        int row = scanner.nextInt(); // kullanıcının girdiği satır sayısı değerini, row değişkenine atadık
        System.out.print("Sutun sayisini giriniz: "); // kullanıcıya kaç sütunluk bir oyun istediğini sorduk
        int col = scanner.nextInt(); //  kullanıcının girdiği sütun sayısı değerini, col değişkenine atadık

        Minesweeper game = new Minesweeper(row, col); // Girilen satır ve sütun sayılarına göre bir Minesweeper nesnesi oluşturduk
        game.play(); // Minesweeper nesnesindeki play() metodunu çağrdık ve oyunu başlattık
    }
}



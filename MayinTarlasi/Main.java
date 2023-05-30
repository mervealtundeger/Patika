import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz: ");
        int row = scanner.nextInt();
        System.out.print("Sutun sayisini giriniz: ");
        int col = scanner.nextInt();

        Minesweeper game = new Minesweeper(row, col);
        game.play();
    }
}



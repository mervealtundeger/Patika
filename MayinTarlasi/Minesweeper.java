
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    private int row; // matrisin satır sayısı
    private int col; // matrisin sütun sayısı
    private int[][] board; // mayınlar ve numaralandırmalar için kullanılacak matris
    private boolean[][] marked; // hangi noktaların işaretlendiğini tutacak ikinci matris
    private int mines; // mayın sayısı
    private int uncovered; // açılmamış nokta sayısı

    public Minesweeper(int row, int col) {
        this.row = row;
        this.col = col;
        board = new int[row][col];
        marked = new boolean[row][col];
        mines = row * col / 4;

        Random random = new Random();
        for (int i = 0; i < mines; i++) {
            int r = random.nextInt(row);
            int c = random.nextInt(col);
            if (board[r][c] != -1) {
                board[r][c] = -1;
            } else {
                i--;
            }
        }

        uncovered = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard();
            System.out.print("Satir giriniz: ");
            int r = scanner.nextInt();
            System.out.print("Sutun giriniz: ");
            int c = scanner.nextInt();

            if (!isValid(r, c)) {
                System.out.println("Girilen degerler matrisin sinirlari disinda!");
                continue;
            }

            if (board[r][c] == -1) {
                System.out.println("Mayina bastiniz, oyunu kaybettiniz!");
                return;
            }

            if (marked[r][c]) {
                System.out.println("Bu noktayi zaten isaretlediniz!");
                continue;
            }

            int count = countMines(r, c);
            board[r][c] = count;
            marked[r][c] = true;
            uncovered++;

            if (count == 0) {
                uncoverNeighbors(r, c);
            }

            if (uncovered == row * col - mines) {
                System.out.println("Tebrikler, tum noktalari acmayi basardiniz!");
                return;
            }
        }
    }

    private boolean isValid(int r, int c) {
        return r >= 0 && r < row && c >= 0 && c < col;
    }

    private int countMines(int r, int c) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) {
                    continue;
                }
                int nr = r + dr;
                int nc = c + dc;
                if (isValid(nr, nc) && board[nr][nc] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void uncoverNeighbors(int r, int c) {
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) {
                    continue;
                }
                int nr = r + dr;
                int nc = c + dc;
                if (isValid(nr, nc) && !marked[nr][nc]) {
                    int count = countMines(nr, nc);
                    board[nr][nc] = count;
                    marked[nr][nc] = true;
                    uncovered++;
                    if (count == 0) {
                        uncoverNeighbors(nr, nc);
                    }
                }
            }
        }
    }

    private void printBoard() {
        System.out.print("  ");
        for (int c = 0; c < col; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int r = 0; r < row; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < col; c++) {
                if (marked[r][c]) {
                    System.out.print(board[r][c] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
/*
play() yöntemi, kullanıcıdan satır ve sütun koordinatları biçiminde giriş yapmasını isteyen bir döngü içerir
Girişin geçerli olup olmadığını, bir mayın olup olmadığını ve hücrenin zaten işaretlenmiş olup olmadığını kontrol eder
Daha sonra tahtayı günceller ve bir kazanma durumunu kontrol eder
isvalid() yöntemi, bir giriş koordinatının oyun tahtasının sınırları içinde olup olmadığını kontrol eder
printboard() yöntemi, oyun tahtasının mevcut durumunu yazdırır
countmines() yöntemi, belirtilen bir hücrenin komşu hücrelerinde kaç tane mayın olduğunu belirler
uncoverneighbors() yöntemi, komşu mayınlara sahip hücrelere çarpana kadar tüm komşu hücreleri yinelemeli olarak ortaya çıkarır.
*/


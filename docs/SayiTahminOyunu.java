//Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" programını kodluyoruz

import java.util.Random;  // İlk olarak 'java.util.Random' sınıfını import ediyoruz. Bu sınıf, rastgele sayılar üretmek için kullanacağız

import java.util.Scanner; // 'java.util.Scanner' sınıfını import ediyoruz. Bu sınıf ise kullanıcıdan girdi almak için kullanacağız

public class GuessNumber {

    public static void main(String[] args) {

        Random random = new Random(); // Rastgele bir sayı üretmek için yeni bir 'Random' nesnesi oluşturuyoruz
        int randomNumber = random.nextInt(100) + 1; // 'random.nextInt(100) + 1' ifadesi, 1 ile 100 arasında rastgele bir tam sayı üretir ve 'randomNumber' değişkenine atar
        int remainingGuesses = 5; // 'remainingGuesses' değişkenini kullanıcının kaç tahmin hakkının kaldığını tutmak için kullandık
        Scanner scanner = new Scanner(System.in); // Yeni bir 'Scanner' nesnesi oluşturuyoruz, böylece kullanıcının girdilerini okuyabiliriz

        while (remainingGuesses > 0) { // 'while' döngüsünün; kullanıcının tahmin hakkının kalmadığı veya doğru cevabı verdiği durumlar dışında çalışmasını sağladık
            System.out.print("Lütfen bir sayı tahmin edin: ");
            int guess = scanner.nextInt(); // 'scanner.nextInt()' ifadesinin kullanıcının girdiği tam sayıyı okuması ve 'guess' değişkenine atamasını sağladık

            if (guess == randomNumber) { //  kullanıcının tahmini doğru ise çalışır
                System.out.println("Tebrikler, doğru tahmin ettiniz!");
                break; // döngüden çıkarak programı sonlandırdık
            } else if (guess > randomNumber) {
                System.out.println("Daha küçük bir sayı tahmin edin.");
            } else {
                System.out.println("Daha büyük bir sayı tahmin edin.");
            }

            remainingGuesses--; // 'remainingGuesses--' ifadesi ile her tahmin sonrası kullanıcının hakkının bir azaltılmasını sağladık
            System.out.println("Kalan tahmin hakkınız: " + remainingGuesses);
        }

        if (remainingGuesses == 0) { // 'if' bloğu ile kullanıcının tüm tahmin hakkını kullanması durumda ; çalışmasını ve doğru cevabı göstermesini sağladık
            System.out.println("Tahmin hakkınız bitti. Doğru cevap: " + randomNumber);
        }

        scanner.close(); // 'scanner.close()' ifadesi ile 'Scanner' nesnesinin kullanımını sonlandırdık
    }
}


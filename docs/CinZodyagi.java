//Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program 
import java.util.Scanner;

public class ChinZodiacCalculation {
  
  /*
  kullanıcıya doğum yılını girme olanağı sunar. 
  Doğum yılı modulo 12'ye göre hesaplanır ve switch-case yapısı aracılığıyla Çin zodyağı değeri hesaplanır. 
  Son olarak program, hesaplanan Çin zodyağı değerini ekranda gösterir.
  */

    public static void main(String[] args) {
        int yearOfBirth;
        String chineseZodiac = "";
        Scanner sc = new Scanner(System.in); // kullanıcı girişi için Scanner sınıfı kullanıyoruz
        System.out.print("Lütfen doğum yılınızı giriniz: "); // kullanıcıdan doğum yılını alıyoruz
        yearOfBirth = sc.nextInt();
        
        switch (yearOfBirth % 12) { // Çin zodyağı hayvanlarının listesi ve kullanıcın doğum yılının Çin zodyağındaki indeksi

            case 0:
                chineseZodiac = "Maymun";
                break;
            case 1:
                chineseZodiac = "Horoz";
                break;
            case 2:
                chineseZodiac = "Köpek";
                break;
            case 3:
                chineseZodiac = "Domuz";
                break;
            case 4:
                chineseZodiac = "Fare";
                break;
            case 5:
                chineseZodiac = "Öküz";
                break;
            case 6:
                chineseZodiac = "Kaplan";
                break;
            case 7:
                chineseZodiac = "Tavşan";
                break;
            case 8:
                chineseZodiac = "Ejderha";
                break;
            case 9:
                chineseZodiac = "Yılan";
                break;
            case 10:
                chineseZodiac = "At";
                break;
            case 11:
                chineseZodiac = "Koyun";
                break;
        }
        System.out.println("Çin zodyağı burcunuz: " + chineseZodiac); // hesaplanan değeri yazdırıyoruz
    }
  /*
  Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. 
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
  
  */

}

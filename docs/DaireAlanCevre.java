//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan program
import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin: ");
        double yariCap = input.nextDouble();

        double alan = pi * yariCap * yariCap; //Alan Formülü : π * r * r;
        double cevre = 2 * pi * yariCap;      //Çevre Formülü : 2 * π * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        System.out.print("Daire diliminin merkez açısını girin: ");
        double merkezAci = input.nextDouble();

        double dilimAlan = (pi * yariCap * yariCap * merkezAci) / 360; //Formül : (𝜋 * (r*r) * 𝛼) / 360

        System.out.println("Daire diliminin alanı: " + dilimAlan);

        input.close();
      
      /*
      Kullanıcıdan önce dairenin yarıçapını, sonra daire diliminin merkez açısını girmesini istiyor. 
      Daha sonra, önce dairenin alanını ve çevresini hesaplayıp ekrana yazdırıyor, 
      ardından daire diliminin alanını hesaplayıp yine ekrana yazdırıyor.
        
      */
    }
}


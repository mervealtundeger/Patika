//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 2, 8, 3}; // Örnek bir dizi
        Map<Integer, Integer> frequencies = new HashMap<>(); // Boş bir frekans tablosu oluşturuyoruz

        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if(frequencies.containsKey(num)) { // Eğer frekans tablosunda bu sayı varsa
                int count = frequencies.get(num); // O sayının frekans değerini alıyoruz
                frequencies.put(num, count + 1); // Frekans değerini 1 artırıp geri ekliyoruz
            } else {
                frequencies.put(num, 1); // Eğer sayı yoksa, frekans değeri 1 olarak ekleniyor
            }
        }

        for(Map.Entry<Integer, Integer> entry : frequencies.entrySet()) { // Frekans tablosundaki tüm girdileri gezerek yazdırıyoruz
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
/*
   Dizideki elemanların frekanslarını hesaplamak için bir 'Map' kullanmaktadır.
   Map'te, her elemanın bir key ve value değeri vardır. key, elemanın kendisi iken value, o elemanın kaç kez tekrar ettiğinin frekans değeridir. 
   İlk olarak, örnek bir dizi oluşturuyoruz (arr) ve frekansları bu dizi üzerinde hesaplayacağız. 
   Map` ile çalışmak için ilk olarak boş bir HashMap nesnesi oluşturuyorz (frequencies).
   for döngüsü ile, dizideki tüm elemanları gezerek frekanslarını hesaplayacağız. 
   Her elemanı alıp frequencies Map'inde bulunup bulunmadığını kontrol ediyoruz (containsKey). 
   Eğer Map'te varsa, o ana kadar o elemanın kaç kez tekrar ettiğini get metodu ile alıyoruz. 
   Sonrasında bu değeri 1 artırıp geri put metodu ile Map'e geri yazıyoruz. 
   Eğer Map'te yoksa, yeni bir eleman olduğu için frekans değeri 1 olarak put metodu ile ekleniyor.
   Son olarak, frekans tablosundaki tüm elemanları döngü ile gezerek yazdırıyoruz.
   entrySet() metodu, frekans tablosundaki tüm girdileri Set tipinden bir nesneye dönüştürür. 
   Her bir girdiyi gezmek için for-each döngüsü kullanıyoruz. Her elemanın key ve value değerleri yazdırılarak program sonlandırılır.
*/
}


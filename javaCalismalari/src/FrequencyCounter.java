import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Örnek bir dizi tanımlıyoruz
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};

        // Dizinin elemanlarının frekanslarını hesaplayan metodu çağırıyoruz
        Map<Integer, Integer> frequencyMap = calculateFrequency(numbers);

        // Sonuçları yazdırıyoruz
        System.out.println("Dizinin elemanlarının frekansları:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Eleman: " + entry.getKey() + ", Frekans: " + entry.getValue());
        }
    }

    // Frekans hesaplama metodunu tanımlıyoruz
    public static Map<Integer, Integer> calculateFrequency(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Diziyi döngü ile gezip her elemanın frekansını hesaplıyoruz
        for (int num : numbers) {
            if (frequencyMap.containsKey(num)) {
                // Eğer eleman zaten varsa, frekansını artırıyoruz
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Eğer eleman yoksa, frekansını 1 olarak başlatıyoruz
                frequencyMap.put(num, 1);
            }
        }

        return frequencyMap;
    }
}

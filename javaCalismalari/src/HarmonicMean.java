public class HarmonicMean {
    public static void main(String[] args) {
        // Diziyi tanımlıyoruz
        double[] numbers = {1, 2, 3, 4, 5};

        // Harmonik ortalamayı hesaplamak için metodu çağırıyoruz
        double harmonicMean = calculateHarmonicMean(numbers);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Dizinin Harmonik Ortalaması: " + harmonicMean);
    }

    // Harmonik ortalamayı hesaplayan metod
    public static double calculateHarmonicMean(double[] numbers) {
        double sumOfReciprocals = 0;  // Terslerin toplamını tutacak değişken
        int n = numbers.length;       // Dizinin eleman sayısı

        // Her elemanın tersini alıp topluyoruz
        for (double num : numbers) {
            sumOfReciprocals += 1.0 / num;
        }

        // Harmonik ortalamayı hesaplıyoruz
        return n / sumOfReciprocals;
    }
}

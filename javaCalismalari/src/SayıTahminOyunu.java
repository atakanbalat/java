import java.util.Scanner;
import java.util.Random;

public class SayıTahminOyunu {
    public static void main(String[] args) {
        // Random nesnesi ile rastgele sayı üretme
        Random random = new Random();
        int doğruSayı = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı

        // Scanner nesnesi ile kullanıcıdan giriş almak
        Scanner scanner = new Scanner(System.in);

        int tahmin;
        int denemeSayısı = 0;

        System.out.println("0 ile 100 arasında bir sayı tahmin edin!");

        // Kullanıcı doğru sayıyı tahmin edene kadar döngü devam eder
        while (true) {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            denemeSayısı++;

            // Tahmin kontrolü
            if (tahmin < doğruSayı) {
                System.out.println("Daha büyük bir sayı girin!");
            } else if (tahmin > doğruSayı) {
                System.out.println("Daha küçük bir sayı girin!");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı " + denemeSayısı + " denemede bildiniz.");
                break; // Doğru tahmin yapıldığında döngü sonlanır
            }
        }

        scanner.close(); // Kaynakları serbest bırakmak için Scanner'ı kapatıyoruz
    }
}

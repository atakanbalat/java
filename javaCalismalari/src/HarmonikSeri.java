import java.util.Scanner;

public class HarmonikSeri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        double harmonikToplam = 0.0;

        // Harmonik seriyi hesaplıyoruz
        for (int i = 1; i <= n; i++) {
            harmonikToplam += 1.0 / i; // 1/i'yi topluyoruz
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println(n + " sayısının harmonik serisi: " + harmonikToplam);

        scanner.close();
    }
}

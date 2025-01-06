import java.util.Scanner;

public class CiftVeDordunKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        // Sonsuz döngü başlatıyoruz, kullanıcı negatif bir sayı girene kadar devam edecek
        while (true) {
            System.out.print("Bir sayı giriniz (negatif bir sayı girene kadar devam): ");
            int sayi = scanner.nextInt();

            // Eğer kullanıcı negatif bir sayı girerse döngüyü kırıyoruz
            if (sayi < 0) {
                break;
            }

            // Çift ve 4'ün katı olan sayıları kontrol ediyoruz
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;  // Şartı sağlayan sayıları topluyoruz
            }
        }

        // Toplamı ekrana yazdırıyoruz
        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);

        scanner.close();
    }
}

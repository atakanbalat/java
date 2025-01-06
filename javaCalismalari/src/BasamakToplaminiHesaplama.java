import java.util.Scanner;

public class BasamakToplaminiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        // Sayının basamaklarını teker teker işliyoruz
        while (sayi > 0) {
            // Sayının son basamağını almak için mod 10 alıyoruz
            int basamak = sayi % 10;

            // Basamağı toplam değişkenine ekliyoruz
            toplam += basamak;

            // Sayıyı bir basamak sağa kaydırıyoruz (10'a bölüyoruz)
            sayi /= 10;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Basamakların toplamı: " + toplam);

        scanner.close();
    }
}

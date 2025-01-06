import java.util.Scanner;

public class EnBuyukEnKucukSayiyiBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan N sayısını alıyoruz
        System.out.print("Kaç tane sayıyı gireceksiniz? ");
        int n = scanner.nextInt();

        // İlk sayıyı alıp başlangıç için en büyük ve en küçük olarak belirliyoruz
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        // Diğer N-1 sayıyı alıyoruz ve her birini karşılaştırıyoruz
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scanner.nextInt();

            // En büyük ve en küçük sayıyı güncelliyoruz
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scanner.close();
    }
}

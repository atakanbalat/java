import java.util.Scanner;

public class KombinasyonHesapla {

    // Faktöriyel hesaplamak için bir metot
    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Kombinasyon hesaplamak için metot
    public static long kombinasyon(int n, int r) {
        if (r > n) {
            return 0;  // Kombinasyonun geçerli olmaması durumu
        }
        long nFaktoriyel = faktoriyel(n);
        long rFaktoriyel = faktoriyel(r);
        long nRfactoriyel = faktoriyel(n - r);

        return nFaktoriyel / (rFaktoriyel * nRfactoriyel);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini alıyoruz
        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        // Kombinasyonu hesaplıyoruz
        long sonuc = kombinasyon(n, r);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("C(" + n + "," + r + ") = " + sonuc);

        scanner.close();
    }
}

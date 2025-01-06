import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tutar girmesini iste
        System.out.print("Lütfen tutarı girin: ");
        double tutar = scanner.nextDouble();

        double kdvOrani;
        double kdvTutari;
        double kdvliFiyat;

        // Tutar 0 ile 1000 TL arasında ise %18, 1000 TL'den büyükse %8 KDV oranını uygula
        if (tutar >= 0 && tutar <= 1000) {
            kdvOrani = 0.18;  // %18 KDV
        } else {
            kdvOrani = 0.08;  // %8 KDV
        }

        // KDV tutarını ve KDV'li fiyatı hesapla
        kdvTutari = tutar * kdvOrani;
        kdvliFiyat = tutar + kdvTutari;

        // Sonuçları ekrana yazdır
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

        // Kaynak kodu bitir
        scanner.close();
    }
}

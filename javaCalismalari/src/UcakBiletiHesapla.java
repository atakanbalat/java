import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alıyoruz
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Geçerli olmayan girişleri kontrol ediyoruz
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return; // Hatalı veri girildiği için program sonlandırılır
        }

        // Mesafe başına ücret
        double normalTutar = mesafe * 0.10;

        // Yaş indirimi
        double yasIndirimi = 0;
        if (yas < 12) {
            yasIndirimi = normalTutar * 0.50; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = normalTutar * 0.10; // %10 indirim
        } else if (yas > 65) {
            yasIndirimi = normalTutar * 0.30; // %30 indirim
        }

        // İndirimli tutarı hesaplıyoruz
        double indirimliTutar = normalTutar - yasIndirimi;

        // Yolculuk tipi indirim
        double yolculukTipiIndirimi = 0;
        if (yolculukTipi == 2) {
            yolculukTipiIndirimi = indirimliTutar * 0.20; // %20 indirim gidiş-dönüş için
        }

        // Toplam tutarı hesaplıyoruz
        double toplamTutar = (indirimliTutar - yolculukTipiIndirimi) * (yolculukTipi == 2 ? 2 : 1);

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        scanner.close();
    }
}

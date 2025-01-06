import java.util.Scanner;

public class DersNotlari {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturulur
        Scanner scanner = new Scanner(System.in);

        // Derslerin isimlerini tanımlıyoruz
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int[] notlar = new int[5];  // Ders notlarını saklamak için bir dizi

        int toplam = 0;
        int gecerliDersSayisi = 0;

        // Ders notlarını almak
        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " notunu girin: ");
            int notDegeri = scanner.nextInt();

            // Geçerli bir not olup olmadığını kontrol et
            if (notDegeri >= 0 && notDegeri <= 100) {
                notlar[i] = notDegeri;
                toplam += notDegeri;
                gecerliDersSayisi++; // Geçerli bir ders sayısını artır
            } else {
                System.out.println("Geçersiz not! " + dersler[i] + " dersi ortalamaya dahil edilmiyor.");
            }
        }

        // Ortalama hesapla
        if (gecerliDersSayisi > 0) {
            double ortalama = (double) toplam / gecerliDersSayisi;
            System.out.println("Geçerli derslerin ortalaması: " + ortalama);

            // Ortalamaya göre değerlendirme yap
            if (ortalama >= 55) {
                System.out.println("Tebrikler, geçtiniz!");
            } else {
                System.out.println("Maalesef, kaldınız.");
            }
        } else {
            System.out.println("Geçerli ders notu girilmedi.");
        }

        scanner.close();  // Scanner nesnesini kapatıyoruz
    }
}

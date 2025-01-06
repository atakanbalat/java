import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Derslerin notlarını kullanıcıdan alıyoruz
        System.out.print("Matematik notunuzu girin: ");
        double mat = scanner.nextDouble();

        System.out.print("Fizik notunuzu girin: ");
        double fizik = scanner.nextDouble();

        System.out.print("Kimya notunuzu girin: ");
        double kimya = scanner.nextDouble();

        System.out.print("Türkçe notunuzu girin: ");
        double turkce = scanner.nextDouble();

        System.out.print("Tarih notunuzu girin: ");
        double tarih = scanner.nextDouble();

        System.out.print("Müzik notunuzu girin: ");
        double muzik = scanner.nextDouble();

        // Ortalamayı hesaplıyoruz
        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        // Ortalamayı ekrana yazdırıyoruz
        System.out.println("Not ortalamanız: " + ortalama);

        // Ternary operator kullanılarak sınıfı geçme durumu kontrol ediliyor
        String durum = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        // Sonuç ekrana yazdırılıyor
        System.out.println(durum);

        scanner.close();
    }
}

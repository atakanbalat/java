import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan gidilen mesafe alınır
        System.out.print("Gidilen mesafeyi (KM cinsinden) girin: ");
        double mesafe = input.nextDouble();

        // Taksimetre açılış ücreti ve km başına ücret
        double acilisUcreti = 10.0;
        double kmUcreti = 2.20;

        // Toplam ücret hesaplanıyor
        double toplamTutar = acilisUcreti + (mesafe * kmUcreti);

        // Eğer toplam ücret 20 TL'den azsa, 20 TL alınacak
        if (toplamTutar < 20) {
            toplamTutar = 20;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Toplam ücret: " + toplamTutar + " TL");
    }
}

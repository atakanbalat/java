import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);

        // Kilo ve boy verileri alınır
        System.out.print("Kilonuzu girin (kg): ");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu girin (cm cinsinden): ");
        double boyCm = input.nextDouble();

        // Boyu cm'den metreye çeviriyoruz
        double boyMetre = boyCm / 100;

        // Vücut Kitle İndeksi (VKİ) hesaplanır
        double vki = kilo / (boyMetre * boyMetre);

        // Hesaplanan VKİ ekrana yazdırılır
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        // VKİ'ye göre sağlık durumu sınıflandırması
        if (vki < 18.5) {
            System.out.println("Zayıf.");
        } else if (vki >= 18.5 && vki <= 24.9) {
            System.out.println("Normal kilolu.");
        } else if (vki >= 25.0 && vki <= 29.9) {
            System.out.println("Fazla kilolu.");
        } else if (vki >= 30.0 && vki <= 34.9) {
            System.out.println("Obez (1. derece obezite).");
        } else {
            System.out.println("Şiddetli Obez (2. derece obezite ve üstü).");
        }
    }
}

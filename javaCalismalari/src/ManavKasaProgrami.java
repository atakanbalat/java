import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);

        // Meyve ve fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan alınan toplam tutar
        double toplamTutar = 0.0;

        // Ürünlerin kilosu kullanıcıdan alınıyor
        System.out.print("Armut kaç kilogram? : ");
        double armutKg = input.nextDouble();
        toplamTutar += armutKg * armutFiyat;

        System.out.print("Elma kaç kilogram? : ");
        double elmaKg = input.nextDouble();
        toplamTutar += elmaKg * elmaFiyat;

        System.out.print("Domates kaç kilogram? : ");
        double domatesKg = input.nextDouble();
        toplamTutar += domatesKg * domatesFiyat;

        System.out.print("Muz kaç kilogram? : ");
        double muzKg = input.nextDouble();
        toplamTutar += muzKg * muzFiyat;

        System.out.print("Patlıcan kaç kilogram? : ");
        double patlicanKg = input.nextDouble();
        toplamTutar += patlicanKg * patlicanFiyat;

        // Toplam tutar ekrana yazdırılır
        System.out.println("Toplam tutar: " + toplamTutar + " TL");
    }
}

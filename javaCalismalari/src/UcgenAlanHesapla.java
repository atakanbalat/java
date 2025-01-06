import java.util.Scanner;

public class UcgenAlanHesapla {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üçgenin kenarlarını alıyoruz
        System.out.print("Birinci kenarı girin: ");
        double a = input.nextDouble();

        System.out.print("İkinci kenarı girin: ");
        double b = input.nextDouble();

        System.out.print("Üçüncü kenarı girin: ");
        double c = input.nextDouble();

        // Yarım çevreyi hesaplıyoruz
        double u = (a + b + c) / 2;

        // Alanı hesaplıyoruz
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Üçgenin Alanı: " + alan);
    }
}

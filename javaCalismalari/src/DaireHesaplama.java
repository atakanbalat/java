import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);

        // Yarıçap alınır
        System.out.print("Dairenin yarıçapını girin: ");
        double r = input.nextDouble();

        // π sayısı
        double pi = 3.14;

        // Dairenin alanı ve çevresi hesaplanır
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        // Alan ve çevre ekrana yazdırılır
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}

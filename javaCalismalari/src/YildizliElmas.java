import java.util.Scanner;

public class YildizliElmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan elmasın boyutunu alıyoruz
        System.out.print("Elmasın boyutunu giriniz (çift olmayan bir sayı): ");
        int n = scanner.nextInt();

        // Elmasın üst kısmı (Üçgen şeklinde)
        for (int i = 1; i <= n; i += 2) {
            // Boşlukları yazdırıyoruz
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırıyoruz
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Yeni satıra geçiyoruz
        }

        // Elmasın alt kısmı (Ters üçgen şeklinde)
        for (int i = n - 2; i >= 1; i -= 2) {
            // Boşlukları yazdırıyoruz
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırıyoruz
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Yeni satıra geçiyoruz
        }

        scanner.close();
    }
}

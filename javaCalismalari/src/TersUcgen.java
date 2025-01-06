import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alıyoruz
        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();

        // Ters üçgeni çiziyoruz
        for (int i = basamak; i >= 1; i--) {
            // Satırda i tane yıldız yazdırıyoruz
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Bir satırın sonuna geldiğimizde yeni satıra geçiyoruz
            System.out.println();
        }

        scanner.close();
    }
}

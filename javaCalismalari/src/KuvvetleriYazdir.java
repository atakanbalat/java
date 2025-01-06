import java.util.Scanner;

public class KuvvetleriYazdir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı girişi alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // 4'ün kuvvetlerini yazdırıyoruz
        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; Math.pow(4, i) <= sayi; i++) {
            System.out.println("4^" + i + " = " + (int)Math.pow(4, i));
        }

        // 5'in kuvvetlerini yazdırıyoruz
        System.out.println("5'in kuvvetleri:");
        for (int i = 0; Math.pow(5, i) <= sayi; i++) {
            System.out.println("5^" + i + " = " + (int)Math.pow(5, i));
        }

        scanner.close();
    }
}

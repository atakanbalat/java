import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını al
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        // Fibonacci serisini yazdırmak için gerekli değişkenler
        int a = 0, b = 1, c;

        // İlk iki elemanı ekrana yazdır
        System.out.print("Fibonacci Serisi: ");

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Fibonacci serisinin geri kalan elemanlarını hesapla ve yazdır
        for (int i = 3; i <= n; i++) {
            c = a + b;  // Fibonacci kuralına göre sayıları toplama
            System.out.print(c + " ");
            a = b;  // a'yı b'ye eşitle
            b = c;  // b'yi c'ye eşitle
        }

        scanner.close();  // Scanner'ı kapat
    }
}

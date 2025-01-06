import java.util.Scanner;

public class MukemmelSayiKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Mükemmel sayıyı kontrol etme
        int toplam = 0;

        // Sayının bölenlerini buluyoruz
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i; // Bölenleri topluyoruz
            }
        }

        // Sayının mükemmel olup olmadığını kontrol ediyoruz
        if (toplam == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }

        scanner.close();
    }
}

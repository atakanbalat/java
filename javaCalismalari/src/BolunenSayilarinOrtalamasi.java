import java.util.Scanner;

public class BolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int sayac = 0;

        // 0'dan girilen sayıya kadar olan sayılar üzerinde döngü
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i; // 3 ve 4'e tam bölünen sayıyı toplama ekliyoruz
                sayac++;     // Sayıları sayıyoruz
            }
        }

        // Ortalamayı hesaplıyoruz
        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunmamaktadır.");
        }

        scanner.close();
    }
}

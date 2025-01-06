import java.util.Scanner;

public class UsluSayiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alıyoruz
        System.out.print("Taban sayısını giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs sayısını giriniz: ");
        int us = scanner.nextInt();

        // Başlangıçta sonucu 1 olarak belirliyoruz (Çünkü herhangi bir sayının sıfırıncı kuvveti 1'dir)
        int sonuc = 1;

        // For döngüsü kullanarak üslü sayıyı hesaplıyoruz
        for (int i = 1; i <= us; i++) {
            sonuc *= taban; // Tabanı her defasında çarpıyoruz
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close();
    }
}

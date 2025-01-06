import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("Birinci sayıyı girin: ");
        double num1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = input.nextDouble();

        // Kullanıcıdan hangi işlemi yapmak istediği alınır
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama (+)");
        System.out.println("2. Çıkarma (-)");
        System.out.println("3. Çarpma (*)");
        System.out.println("4. Bölme (/)");
        int secim = input.nextInt();

        // Switch-case yapısı ile işlem yapılır
        double sonuc = 0;
        boolean islemYapildi = true;

        switch (secim) {
            case 1:
                sonuc = num1 + num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = num1 - num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = num1 * num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                // Bölme işlemi için sıfıra bölme kontrolü yapılır
                if (num2 != 0) {
                    sonuc = num1 / num2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Hata: Bir sayıyı sıfıra bölemezsiniz.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi.");
                islemYapildi = false;
        }

        // Eğer geçerli bir işlem yapılmadıysa, mesaj verir
        if (islemYapildi) {
            System.out.println("İşlem başarıyla tamamlandı.");
        }
    }
}

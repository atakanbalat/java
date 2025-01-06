import java.util.Scanner;

public class SifreSifirlama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Başlangıçta doğru şifre
        String dogruSifre = "1234";  // Örnek doğru şifre
        String kullaniciSifresi;

        // Kullanıcıdan şifre alınır
        System.out.print("Lütfen şifrenizi girin: ");
        kullaniciSifresi = input.nextLine();

        // Şifreyi kontrol et
        if (kullaniciSifresi.equals(dogruSifre)) {
            System.out.println("Şifre doğru!");
        } else {
            System.out.println("Yanlış şifre girdiniz.");

            // Şifreyi sıfırlamak isteyip istemediği sorulur
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                // Yeni şifre istenir
                System.out.print("Yeni şifrenizi girin: ");
                String yeniSifre = input.nextLine();

                // Yeni şifrenin eski şifreyle aynı olup olmadığı kontrol edilir
                if (yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    // Şifre oluşturulmuş olur
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlanmadı.");
            }
        }

        input.close();
    }
}

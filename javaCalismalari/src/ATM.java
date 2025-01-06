import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // ATM'nin başlangıç bakiyesi
        double balance = 1000.0;

        // Kullanıcı girişi için scanner
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı adı ve şifre
        String username = "user";
        String password = "1234";

        // Kullanıcı girişi
        System.out.print("Kullanıcı adınızı girin: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Şifrenizi girin: ");
        String enteredPassword = scanner.nextLine();

        // Kullanıcı girişi kontrolü
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Giriş başarılı!");

            // ATM işlemleri
            boolean isRunning = true;
            while (isRunning) {
                // Kullanıcı menüsünü görüntüle
                System.out.println("\nATM Menüsü:");
                System.out.println("1 - Bakiye Sorgulama");
                System.out.println("2 - Para Yatırma");
                System.out.println("3 - Para Çekme");
                System.out.println("4 - Çıkış");
                System.out.print("Yapmak istediğiniz işlemi seçin: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:  // Bakiye sorgulama
                        System.out.println("Mevcut bakiye: " + balance + " TL");
                        break;

                    case 2:  // Para yatırma
                        System.out.print("Yatırmak istediğiniz tutarı girin: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println(depositAmount + " TL yatırıldı.");
                        } else {
                            System.out.println("Geçersiz tutar!");
                        }
                        break;

                    case 3:  // Para çekme
                        System.out.print("Çekmek istediğiniz tutarı girin: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= balance && withdrawAmount > 0) {
                            balance -= withdrawAmount;
                            System.out.println(withdrawAmount + " TL çekildi.");
                        } else if (withdrawAmount > balance) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            System.out.println("Geçersiz tutar!");
                        }
                        break;

                    case 4:  // Çıkış
                        System.out.println("ATM'den çıkılıyor...");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Geçersiz işlem! Lütfen tekrar deneyin.");
                        break;
                }
            }
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre!");
        }

        // Scanner'ı kapatmak
        scanner.close();
    }
}

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılı bilgisini alıyoruz
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplamak için yılın 12 ile bölümünden kalanı alıyoruz
        int zodyakIndex = dogumYili % 12;

        // Çin Zodyağı burcunu belirliyoruz
        String burc = "";

        switch (zodyakIndex) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                burc = "Bilinmeyen Burç";
                break;
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Çin Zodyağı Burcunuz: " + burc);

        scanner.close();
    }
}

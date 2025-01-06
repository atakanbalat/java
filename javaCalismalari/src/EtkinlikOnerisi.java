import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz: ");
        int sicaklik = scanner.nextInt();

        String etkinlik = (sicaklik < 5) ? "Kayak yapmayı öneriyoruz." :
                (sicaklik >= 5 && sicaklik < 15) ? "Sinema etkinliğini öneriyoruz." :
                        (sicaklik >= 15 && sicaklik < 25) ? "Piknik yapmayı öneriyoruz." :
                                "Yüzme etkinliğini öneriyoruz.";

        System.out.println(etkinlik);

        scanner.close();
    }
}

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        // EBOB Hesaplama
        int a = num1, b = num2;
        while (a != b) {
            if (a > b) {
                a -= b; // Küçük olan sayıyı büyük olandan çıkar
            } else {
                b -= a; // Küçük olan sayıyı büyük olandan çıkar
            }
        }

        // EBOB bulunduktan sonra
        int ebob = a;
        System.out.println("EBOB: " + ebob);

        // EKOK Hesaplama
        int ekok = (num1 * num2) / ebob;
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }
}

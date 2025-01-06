import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayı alınır
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        // Ternary operatörü kullanarak sıralama yapıyoruz
        int min = (sayi1 <= sayi2 && sayi1 <= sayi3) ? sayi1 : (sayi2 <= sayi1 && sayi2 <= sayi3) ? sayi2 : sayi3;
        int max = (sayi1 >= sayi2 && sayi1 >= sayi3) ? sayi1 : (sayi2 >= sayi1 && sayi2 >= sayi3) ? sayi2 : sayi3;
        int orta = (sayi1 != min && sayi1 != max) ? sayi1 : (sayi2 != min && sayi2 != max) ? sayi2 : sayi3;

        System.out.println("Sıralama: " + min + ", " + orta + ", " + max);

        scanner.close();
    }
}

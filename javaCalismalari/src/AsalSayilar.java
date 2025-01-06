public class AsalSayilar {
    public static void main(String[] args) {
        // 1 ile 100 arasındaki asal sayıları yazdırmak için döngü
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asal = true;

            // 2'den sayıya kadar olan sayılarla bölünüp bölünmediğini kontrol et
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asal = false;  // Eğer böleni varsa, asal sayı değildir
                    break;  // Döngüyü kır
                }
            }

            // Asal sayıları ekrana yazdır
            if (asal) {
                System.out.print(sayi + " ");
            }
        }
    }
}

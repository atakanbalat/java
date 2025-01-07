public class Main {
    public static void main(String[] args) {
        // İki boksör oluşturuluyor
        Boxer boxer1 = new Boxer("Ali", 100, 20);  // Ad, Sağlık, Güç
        Boxer boxer2 = new Boxer("Veli", 100, 18);

        // Maç başlatılıyor
        BoxingMatch match = new BoxingMatch(boxer1, boxer2);
        match.startMatch();
    }
}

public class BoxingMatch {
    private Boxer boxer1;
    private Boxer boxer2;

    // Constructor
    public BoxingMatch(Boxer boxer1, Boxer boxer2) {
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
    }

    // Maç başlatma ve dövüş simülasyonu
    public void startMatch() {
        // Rastgele bir sayı seçerek, kimin başlayacağını belirle
        int firstAttacker = (int) (Math.random() * 2); // 0 veya 1 olmasını sağla
        Boxer attacker = (firstAttacker == 0) ? boxer1 : boxer2;
        Boxer defender = (firstAttacker == 0) ? boxer2 : boxer1;

        System.out.println(attacker.getName() + " will attack first!\n");

        // Maç devam ederken her iki boksör sırayla saldırır
        while (boxer1.isAlive() && boxer2.isAlive()) {
            attacker.attack(defender);

            // Eğer rakip hayatta değilse, maçı sonlandır
            if (!defender.isAlive()) {
                System.out.println(defender.getName() + " has been knocked out!");
                System.out.println(attacker.getName() + " wins!");
                break;
            }

            // Saldırıcı ve savunmacıyı değiştir
            Boxer temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }
}

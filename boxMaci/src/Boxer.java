public class Boxer {
    private String name;
    private int health;
    private int power;

    // Constructor
    public Boxer(String name, int health, int power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    // Saldırı yapma
    public void attack(Boxer opponent) {
        int damage = (int) (Math.random() * this.power);  // Güç değerine bağlı rastgele zarar
        opponent.takeDamage(damage);
        System.out.println(this.name + " attacks " + opponent.getName() + " for " + damage + " damage.");
    }

    // Hasar alma
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // Sağlık durumu
    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    // Boksörün hayatta olup olmadığını kontrol et
    public boolean isAlive() {
        return this.health > 0;
    }
}

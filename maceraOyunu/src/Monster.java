import java.util.Random;

class Monster {
    String type;
    int health;
    int attackPower;

    // Constructor
    public Monster(String type, int health, int attackPower) {
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void attack(Character character) {
        System.out.println(type + " attacks " + character.name);
        character.takeDamage(attackPower);
    }

    public void showStatus() {
        System.out.println(type + " - Health: " + health);
    }
}

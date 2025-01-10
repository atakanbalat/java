import java.util.ArrayList;

class Character {
    String name;
    int health;
    int attackPower;
    int defense;
    String weapon;
    String armor;
    ArrayList<String> inventory;

    // Constructor
    public Character(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.weapon = "None";
        this.armor = "None";
        this.inventory = new ArrayList<>();
    }

    public void equipWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void equipArmor(String armor) {
        this.armor = armor;
    }

    public void takeDamage(int damage) {
        this.health -= (damage - this.defense);
        if (this.health < 0) this.health = 0;
    }

    public void heal(int amount) {
        this.health += amount;
        if (this.health > 100) this.health = 100; // Max health
    }

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void showStatus() {
        System.out.println(name + " - Health: " + health + ", Weapon: " + weapon + ", Armor: " + armor + ", Inventory: " + inventory);
    }
}

import java.util.Random;

class Mine extends Location {
    public Mine() {
        super("Mine", "Battle and loot", "Item (Weapon, Armor or Money)");
    }

    @Override
    public void enter(Character character) {
        super.enter(character);
        Random rand = new Random();

        // Yılanlarla savaş
        int numMonsters = rand.nextInt(5) + 1; // 1-5 arası yılan
        System.out.println("You encounter " + numMonsters + " Snake(s).");

        Monster snake = new Monster("Snake", 12, rand.nextInt(4) + 3); // 3-6 arasında hasar

        // Savaşın ardından ödül kazanma ihtimali
        for (int i = 0; i < numMonsters; i++) {
            int lootChance = rand.nextInt(100);
            if (lootChance < 15) {
                character.addToInventory("Gun");
                System.out.println("You got a Gun!");
            } else if (lootChance < 35) {
                character.addToInventory("Sword");
                System.out.println("You got a Sword!");
            } else if (lootChance < 50) {
                character.addToInventory("Rifle");
                System.out.println("You got a Rifle!");
            } else if (lootChance < 65) {
                character.addToInventory("Armor");
                System.out.println("You got an Armor!");
            } else if (lootChance < 85) {
                character.addToInventory("Heavy Armor");
                System.out.println("You got a Heavy Armor!");
            } else if (lootChance < 95) {
                character.addToInventory("Medium Armor");
                System.out.println("You got a Medium Armor!");
            } else {
                character.addToInventory("Light Armor");
                System.out.println("You got a Light Armor!");
            }

            // Para kazanma
            int moneyChance = rand.nextInt(100);
            if (moneyChance < 25) {
                character.addToInventory("10 Money");
                System.out.println("You got 10 Money!");
            } else if (moneyChance < 55) {
                character.addToInventory("5 Money");
                System.out.println("You got 5 Money!");
            } else {
                character.addToInventory("1 Money");
                System.out.println("You got 1 Money!");
            }
        }
    }
}

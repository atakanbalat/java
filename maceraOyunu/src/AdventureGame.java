import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Create a character
        System.out.println("Enter your character's name: ");
        String name = scanner.nextLine();
        Character player = new Character(name, 100, 20, 5);

        // Create locations
        Location safeHouse = new Location("Safe House", "Health restores", "None");
        Location cave = new Location("Cave", "Battle + Loot", "Food");
        Location forest = new Location("Forest", "Battle + Loot", "Firewood");
        Location river = new Location("River", "Battle + Loot", "Water");
        Location shop = new Location("Shop", "Buy weapons and armor", "None");
        Location mine = new Mine();

        // Game loop
        while (true) {
            System.out.println("\nChoose your location:");
            System.out.println("1. Safe House");
            System.out.println("2. Cave");
            System.out.println("3. Forest");
            System.out.println("4. River");
            System.out.println("5. Shop");
            System.out.println("6. Mine");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    safeHouse.enter(player);
                    player.heal(20); // Heal at the safe house
                    break;
                case 2:
                    cave.enter(player);
                    break;
                case 3:
                    forest.enter(player);
                    break;
                case 4:
                    river.enter(player);
                    break;
                case 5:
                    shop.enter(player);
                    break;
                case 6:
                    mine.enter(player);
                    break;
                case 7:
                    System.out.println("Exiting the game...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }

            // Show status after each action
            player.showStatus();
        }
    }
}

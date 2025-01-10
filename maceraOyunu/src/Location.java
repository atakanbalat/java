class Location {
    String name;
    String specialFeature;
    String loot;

    // Constructor
    public Location(String name, String specialFeature, String loot) {
        this.name = name;
        this.specialFeature = specialFeature;
        this.loot = loot;
    }

    public void enter(Character character) {
        System.out.println(character.name + " entered the " + name);
        System.out.println("Feature: " + specialFeature);
        System.out.println("Loot: " + loot);
    }
}

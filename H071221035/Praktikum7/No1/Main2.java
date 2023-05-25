public class Main2 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Fighter 1",10);
        characters[1] = new Mage("Mage 1",15);
        characters[2] = new Fighter("Fighter 2",8);
        characters[3] = new Fighter("Fighter 3",12);
        characters[4] = new Mage("Mage 2",20); 

        for (Character character : characters) {
            printAttack(character);
        }
        
    }
    public static void printAttack(Character character) {
        int melee = character.attack("melee");
        // int ranged = character.attack("ranged");
        System.out.println(character.getName() + " attacked with " + character.attack() + " attack power, " + " melee " + melee);

        int frost = character.attack("frost");
        // int fire = character.attack("fire");
        System.out.println(character.getName() + " attacked with " + character.attack() + " attack power, " + " frost " + frost);
        System.out.println("=".repeat(20));

    }
    
}

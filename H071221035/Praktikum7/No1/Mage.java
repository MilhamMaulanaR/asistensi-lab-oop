public class Mage extends Character {
    int attackPower;
    public Mage(String name,int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }
    @Override
    int attack() {
        return attackPower;
     }
    @Override
    int attack(String attackType) {
        if (attackType.equals("fire")) {
            return 3 * attackPower;
        } else if (attackType.equals("frost")) {
            return 2 * attackPower;
        } else {
            return 0;
        }
    }
}

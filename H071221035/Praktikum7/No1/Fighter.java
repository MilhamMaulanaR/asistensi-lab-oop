public class Fighter extends Character {
    int attackPower;
    public Fighter(String name,int attackPower) {
        super(name);//
        this.attackPower = attackPower;
    }
    @Override
    int attack() {
        return attackPower;
     }
    @Override
    int attack(String attackType) {
        if (attackType.equals("melee")) {
            return 2 * attackPower;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

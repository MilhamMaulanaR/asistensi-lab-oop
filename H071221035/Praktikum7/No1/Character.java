abstract class Character {
    String name;

    public Character(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract int attack();//akan menampilkan int attack asliya
    abstract int attack(String attackType); //menampilkan int attack berdasarkan tipe attacknya
}

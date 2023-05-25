public class FoodFactory { //untuk mendeteksi tipe
    public static Food getFood(FoodType type) { 
        if (type == FoodType.BURGER) { //{jika objek type sama dengan tulisan BURGER maka dia akan kembalikan kelas burger}
            return new Burger();
        } else if (type == FoodType.PIZZA) {
            return new Pizza();
        } else if (type == FoodType.STEAK) {
            return new Steak();
        } else {
            throw new IllegalArgumentException("Invalid food type: " + type);
        }   
    }
}

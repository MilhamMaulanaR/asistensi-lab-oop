import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood(FoodType.BURGER);
        Food pizza = FoodFactory.getFood(FoodType.PIZZA);
        Food steak = FoodFactory.getFood(FoodType.STEAK);

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
        int total = Restaurant.calculateTotal(foods);
        System.out.println("Total harga makanan: " + total);
    }
}

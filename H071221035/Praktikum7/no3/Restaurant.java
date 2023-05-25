import java.util.List;

public class Restaurant { //untuk menghitung jumlah harga setiap makanan yang ditambhkan kedalam list foods
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (Food food : foods) {
            total += food.getprice();
        }
        return total;
    }
}

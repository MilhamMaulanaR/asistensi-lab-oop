public class Main2 {
    public static void main(String[] args) {
        Product<String> produk1 = new Product<String>("Bon Cabe", "Rp. 9000", "12-04-2024");
        Product<Integer> produk2 = new Product<Integer>("Ultra Milk", 8700, "04-02-2024");
        Product<Double> produk3 = new Product<Double>("Chitato",8.999,"09-11-2023");

        System.out.printf("Product 1 : %s - %s - %s%n", produk1.getName(), produk1.getPrice(), produk1.getExpiryDate());
        System.out.printf("Product 2 : %s - %d - %s%n", produk2.getName(), produk2.getPrice(), produk2.getExpiryDate());
        System.out.printf("Product 3 : %s - %.3f - %s", produk3.getName(), produk3.getPrice(), produk3.getExpiryDate());
    }
}

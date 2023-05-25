public class Product <T> {
    private String name;
    private T price;
    private String expiryDate;
    
    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }
    public String getName() {
        return name;
    }
    public T getPrice() {
        return price;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
}

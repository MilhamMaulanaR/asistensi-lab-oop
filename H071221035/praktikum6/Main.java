
public class Main{
    public static void main(String[] args) {
        System.out.println("=".repeat(40));
        System.out.println("----------------DOG CLASS---------------");
        SiberianHusky siberianHusky = new SiberianHusky(0, 50);
        siberianHusky.move();
        siberianHusky.describe();

        System.out.println();
        
        GermanShepherd germanShepherd = new GermanShepherd(0, 69);
        germanShepherd.move();
        germanShepherd.describe();
;

        System.out.println("=".repeat(40));
        System.out.println("------------SMARTPHONE CLASS------------");
        Smartphone smartphone = new Smartphone(4_999_000, "SAMSUL");
        System.out.printf("Harga\t: Rp. %s%n",smartphone.price);
        System.out.println("Brand\t: " + smartphone.brand);
        smartphone.move();
        System.out.println();

        System.out.println("=".repeat(40));
        System.out.println("---------------CAR CLASS----------------");
        Car car = new Car(5, "Merah PDIP", 300);
        car.move();
        System.out.println("Warna\t\t: " + car.color);
        System.out.printf("Max Speed\t: %s km/jam", car.maxSpeed);
    }   
}
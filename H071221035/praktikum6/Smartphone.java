class Smartphone implements Move{
    protected int price;
    protected String brand;

    Smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }
    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("_Smartphone Berpindah....");;
    }
    
}

interface Food {
    int getprice();
}

class Pizza implements Food {
    int price = 50000;

    @Override
    public int getprice() {
        return price;
    
    }
}

class Steak implements Food {
    int price = 30000;

    @Override
    public int getprice() {
        return price;
    
    }
}

class Burger implements Food {
    int price = 15000;

    @Override
    public int getprice() {
        return price;
    }    
}
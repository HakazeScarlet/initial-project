package learn_oop_2.online_store;

class Goods {

    private final String name;
    private final double price;
    private final double rating;

    public Goods(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}

package learn_oop_2.online_store;

class Goods {

    private String name;
    private double price;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Goods (String name) {
        this.name = name;
    }

}

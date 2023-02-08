package learn_oop_2.online_store;

class Main {

    public static void main(String[] args) {
        Goods[] catalogOfGoods = new Goods[5];
        catalogOfGoods[0] = new Goods("Meat", 0.0, 0.0);
        catalogOfGoods[1] = new Goods("Sugar", 0.0, 0.0);
        catalogOfGoods[2] = new Goods("Bread", 0.0, 0.0);
        catalogOfGoods[3] = new Goods("Fish", 0.0, 0.0);

        Category food = new Category("Food", catalogOfGoods);

        Goods[] purchasedGoods = new Goods[2];
        purchasedGoods[0] = catalogOfGoods[0];
        purchasedGoods[1] = catalogOfGoods[3];

        Basket basket = new Basket();
        basket.setBasketArr(purchasedGoods);

        User user = new User("Andrey", "passW", basket);

        Basket basketOfUser = user.getBasketOfUser();
        Goods[] basketArr = basketOfUser.getBasketArr();

        for (Goods item : basketArr) {
            System.out.println(item);
        }

    }
}

package learn_oop_2.online_store;

class Category {

    private String name;
    private Goods[] goodsArr;

    public Category(String name, Goods[] goodsArr) {
        this.name = name;
        this.goodsArr = goodsArr;
    }

    public String getName() {
        return name;
    }

    public Goods[] getGoodsArr() {
        return goodsArr;
    }
}

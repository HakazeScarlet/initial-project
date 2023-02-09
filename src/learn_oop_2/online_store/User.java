package learn_oop_2.online_store;

class User {

    private String login;
    private String password;
    private Basket basketOfUser;

    public User(String login, String password, Basket basketOfUser) {
        this.login = login;
        this.password = password;
        this.basketOfUser = basketOfUser;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasketOfUser() {
        return basketOfUser;
    }
}

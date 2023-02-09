package learn_oop_2.phone;

class Phone {

    private int number;
    private String model;
    private double weight;

    protected Phone(int userNumber, String userModel, double userWeight) {
        this(userNumber, userModel);
        this.weight = userWeight;
    }

    protected Phone(int userNumber, String userModel) {
        this.number = userNumber;
        this.model = userModel;
    }

    protected Phone() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Call " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Call " + name + " with number " + number);
    }

    void sendMessage(String message, int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + ": " + message);
        }
    }

}

package learn_oop_2.phone;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(12345, "well", 100.0);
        phone1.receiveCall("Olya");
        System.out.println(phone1.getNumber());

        Phone phone2 = new Phone(3456, "kkt");
        phone2.receiveCall("Andrey", 6356);

        Phone phone3 = new Phone();
        phone3.sendMessage("Hello", 4564, 4563, 8790);
    }
}

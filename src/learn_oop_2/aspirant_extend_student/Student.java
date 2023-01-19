package learn_oop_2.aspirant_extend_student;

public class Student {

    protected String fullName;
    protected String lastName;
    protected char group;
    protected double averageMark;
    protected int sumOfScholarship;

    int getScholarship() {

        if (averageMark == 5.0) {
            sumOfScholarship = 100;
            System.out.println("Sum of scholarship of " + fullName + " is: ");
        } else {
            sumOfScholarship = 80;
            System.out.println("Sum of scholarship of " + fullName + " is: ");
        }
        return sumOfScholarship;
    }

}



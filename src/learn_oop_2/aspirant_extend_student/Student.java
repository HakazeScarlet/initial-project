package learn_oop_2.aspirant_extend_student;

public class Student {

    private String fullName;
    private String lastName;
    private char group;
    private double averageMark;
    private int sumOfScholarship;

    int getScholarship() {

        if (averageMark == 5.0) {
            sumOfScholarship = 100;
        } else {
            sumOfScholarship = 80;
        }

        return sumOfScholarship;
    }

}



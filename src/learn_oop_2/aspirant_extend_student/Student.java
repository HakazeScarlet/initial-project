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
        } else {
            sumOfScholarship = 80;
        }
        return sumOfScholarship;
    }

}



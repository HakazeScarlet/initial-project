package learn_oop_2.aspirant_extend_student;

public class Aspirant extends Student{

    private boolean scientificWork;

    int getScholarship() {

        if (averageMark == 5.0) {
            sumOfScholarship = 200;
            System.out.println("Sum of scholarship of " + fullName + " is: ");
        } else {
            sumOfScholarship = 180;
            System.out.println("Sum of scholarship of " + fullName + " is: ");
        }

        return sumOfScholarship;
    }
}

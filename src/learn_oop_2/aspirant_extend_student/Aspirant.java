package learn_oop_2.aspirant_extend_student;

public class Aspirant extends Student{

    private String scientificWork;

    int getScholarship() {

        if (averageMark == 5.0) {
            sumOfScholarship = 200;
        } else {
            sumOfScholarship = 180;
        }

        return sumOfScholarship;
    }
}

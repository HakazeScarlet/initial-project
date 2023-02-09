package learn_oop_2.aspirant_extend_student;

class Aspirant extends Student {

    private static final int COMMON_SCHOLARSHIP = 180;
    private static final int INCREASED_SCHOLARSHIP = 200;

    private boolean scientificWork;

    public int getScholarship() {
        return averageMark == GREAT_AVERAGE_MARK
            ? INCREASED_SCHOLARSHIP
            : COMMON_SCHOLARSHIP;
    }
}

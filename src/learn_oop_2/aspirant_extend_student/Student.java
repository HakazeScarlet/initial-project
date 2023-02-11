package learn_oop_2.aspirant_extend_student;

class Student {

    private static final int COMMON_SCHOLARSHIP = 80;
    private static final int INCREASED_SCHOLARSHIP = 100;
    protected static final double GREAT_AVERAGE_MARK = 5.0;

    protected String fullName;
    protected String lastName;
    protected char group;
    protected double averageMark;
    protected int sumOfScholarship;

    public int getScholarship() {
        return averageMark == GREAT_AVERAGE_MARK
            ? INCREASED_SCHOLARSHIP
            : COMMON_SCHOLARSHIP;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getSumOfScholarship() {
        return sumOfScholarship;
    }

    public void setSumOfScholarship(int sumOfScholarship) {
        this.sumOfScholarship = sumOfScholarship;
    }
}

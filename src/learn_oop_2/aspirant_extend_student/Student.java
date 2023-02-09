package learn_oop_2.aspirant_extend_student;

class Student {

    protected String fullName;
    protected String lastName;
    protected char group;
    protected double averageMark;
    protected int sumOfScholarship;

    public int getScholarship() {

        if (averageMark == 5.0) {
            sumOfScholarship = 100;
            System.out.println("Sum of scholarship of " + fullName + " is: ");
        } else {
            sumOfScholarship = 80;
            System.out.println("Sum of scholarship of " + fullName + " is: ");
        }
        return sumOfScholarship;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
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



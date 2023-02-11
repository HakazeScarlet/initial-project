package learn_oop_2.aspirant_extend_student;

class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Korj");
        student1.setAverageMark(4.8);

        Student student2 = new Student();
        student2.setFullName("Noj");
        student2.setAverageMark(5.0);

        Student aspirant1 = new Aspirant();
        aspirant1.setFullName("Serj");
        aspirant1.setAverageMark(4.7);

        Aspirant aspirant2 = new Aspirant();
        aspirant2.setFullName("Morj");
        aspirant2.setAverageMark(5.0);

        Student[] students = new Student[5];
        students[0] = student1;
        students[1] = student2;
        students[2] = aspirant1;
        students[3] = aspirant2;

        System.out.println("Sum of scholarship of " + student1.getFullName() + " is: " + student1.getScholarship());
        System.out.println("Sum of scholarship of " + student2.getFullName() + " is: " + student2.getScholarship());
        System.out.println("Sum of scholarship of " + aspirant1.getFullName() + " is: " + aspirant1.getScholarship());
        System.out.println("Sum of scholarship of " + aspirant2.getFullName() + " is: " + aspirant2.getScholarship());
    }
}

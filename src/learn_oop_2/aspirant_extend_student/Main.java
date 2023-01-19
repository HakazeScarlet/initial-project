package learn_oop_2.aspirant_extend_student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
            student1.fullName = "Korj";
            student1.averageMark = 4.8;
        Student student2 = new Student();
            student2.averageMark = 5;
            student2.fullName = "Noj";
        Student aspirant1 = new Aspirant();
            aspirant1.fullName = "Serj";
            aspirant1.averageMark = 5;
        Aspirant aspirant2 = new Aspirant();
            aspirant2.fullName = "Morj";
            aspirant2.averageMark = 4.0;

        Student[] students = new Student[5];

        students[0] = student1;
        students[1] = student2;
        students[2] = aspirant1;
        students[3] = aspirant2;

        System.out.println(student1.getScholarship());
        System.out.println(student2.getScholarship());
        System.out.println(aspirant1.getScholarship());
        System.out.println(aspirant2.getScholarship());
    }
}

package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Odil", 45, 'M', "AP18273");
        Student student2 = new Student("Aizat", 41, 'F', "AP17033");
        Student student3 = new Student("Yavuz", 43, 'M', "AP12009");
        Student student4 = new Student("Mehrubon", 34, 'F', "AP11174");

        Student[] students = {student2, student3, student4};

        StudentsGroup group1 = new StudentsGroup("Java Turtles", "01");
        group1.addStudent(student1);
        group1.addStudents(students);

        group1.addStudent("Turgut", 38, 'M', "AP00294");


        System.out.println(group1);

        group1.removeStudent("AP18273");
        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name +" : "+ each.ID);
        }



    }


}
/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */
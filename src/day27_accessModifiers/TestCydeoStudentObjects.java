package day27_accessModifiers;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

    CydeoStudent student1 = new CydeoStudent("Lauren", 27, 'F');
    CydeoStudent student2 = new CydeoStudent("Whitney", 34, 'F');

        System.out.println(student1);
        System.out.println(student2);


        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.magicWord);
        System.out.println(student2.magicWord);

    }
}

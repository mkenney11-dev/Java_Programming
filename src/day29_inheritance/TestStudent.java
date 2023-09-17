package day29_inheritance;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Chris", 22, 'M', 'B', "Cydeo School");
        student1.setAge(27);
        student1.setName("Mark");
        student1.setGender('M');
        student1.setSchoolName("UNH");

        System.out.println(student1);


    }


}

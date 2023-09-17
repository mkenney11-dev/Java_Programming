package day28_EncapsulationOOP.Encapsulation;

public class Test {

        public static void main(String[] args) {

            Student student = new Student();

            // student.age = -200;

            //  System.out.println( student.age );

            student.setAge(25);
            student.setName("Alex");

            System.out.println( student.getAge());


            // student.name = "Aaron";
            //  student.setName("Aaron");

            System.out.println(student.getName());





        }

    }


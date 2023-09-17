package day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudents {

    public final void language() {
        System.out.println("Java programming");
    }
}
public class FinalKeyword extends CydeoStudents{

//    @Override -------> final method cannot be overridden
//    public void language() {
//        System.out.println("Python Programming");
//    }

    public static void main(String[] args) {

        final char gender = 'M';
        System.out.println(gender);


        System.out.println("-----------------------");

        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);


        System.out.println("-----------------------");

        new CydeoStudents().language();
        new FinalKeyword().language();


    }

}
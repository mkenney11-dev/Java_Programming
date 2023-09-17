package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        int num = Integer.parseInt(str);

        System.out.println(num + 1);

       Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("--------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("-------------------------");

        String x = "true";

        boolean isTrue = Boolean.parseBoolean(x);
        System.out.println(isTrue);

        Boolean isAlsoTrue = Boolean.valueOf(x);
        System.out.println(isAlsoTrue);

        System.out.println("--------------------------------");

        char ch = '#';
        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch);



        System.out.println("is digit = " +isDigit);
        System.out.println("is letter = " +isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);

        System.out.println("--------------------------------------");


        String string = "a1b2c3d4e5";

        int sum = 0;

     for (char each : string.toCharArray()) {
           if(Character.isDigit(each)){
            sum += Integer.parseInt(""+each);
           }

     }


     System.out.println(sum);


    }
}

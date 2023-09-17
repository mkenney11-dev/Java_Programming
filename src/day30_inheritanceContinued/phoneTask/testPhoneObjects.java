package day30_inheritanceContinued.phoneTask;

import day30_inheritanceContinued.phoneTask.Nokia;
import day30_inheritanceContinued.phoneTask.Samsung;
import day30_inheritanceContinued.phoneTask.iPhone;

public class testPhoneObjects {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("iPhone 10", "X", 850.00, "White");

        Samsung samsung = new Samsung("Galaxy S22", "Medium", 700.00, "Silver");

        Nokia nokia = new Nokia("Brick", "Small", 50.00, "Pink");

        iphone.faceTime("iphone@gmail.com");

        samsung.call(8373888);

        nokia.text(7229344);

        iphone.faceTime(84374999);
        samsung.freeze();

        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }
}

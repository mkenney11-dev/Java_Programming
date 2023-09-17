package day30_inheritanceContinued.phoneTask;

import day30_inheritanceContinued.phoneTask.Phone;

public class Samsung extends Phone {

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(getBrand()+ " freezes a lot");
    }


}

package day30_inheritanceContinued.phoneTask;

public class iPhone extends Phone { //iPhone is a Phone


    public iPhone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public static boolean hasApplePay = true;

   public void faceTime(long phoneNumber){
       System.out.println(getModel() + " is faceTiming with: " + phoneNumber);
   }
    public void faceTime(String email){

    }



}
/*
extra methods :
    faceTime(phoneNumber)
    faceTime(email)

 */


package day26_statics;

public class TestiPhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 12", "white", 950.00);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.model);

        iPhone.printPhoneInfo();

        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();


    }
}

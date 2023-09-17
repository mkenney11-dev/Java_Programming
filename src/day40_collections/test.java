package day40_collections;

public class test {

    public static void dosum(Integer x, Integer y){
        System.out.println("Integer sum is " + (x + y));
    }
    public static void dosum(short x, short y){
        System.out.println("short sum is " + (x + y));
    }
    public static void dosum(long x, long y){
        System.out.println("long sum is " + (x + y));
    }
    public static void dosum(float x, float y){
        System.out.println("float sum is " + (x + y));
    }
    public static void dosum(double x, double y){
        System.out.println("double sum is " + (x + y));
    }

    public static void main(String[] args){
        dosum(10,20);
        dosum(10.0F, 20.0);
    }

}

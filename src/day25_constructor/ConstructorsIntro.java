package day25_constructor;


public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument");
    }

    public ConstructorsIntro(int a){
        System.out.println("object is created by using int argument");
    }

    public void add(){

    }

    public static void main(String[] args) {

        ConstructorsIntro obj = new ConstructorsIntro(10);
        ConstructorsIntro obj2 = new ConstructorsIntro(20);
        ConstructorsIntro obj3 = new ConstructorsIntro(10);



    }

}

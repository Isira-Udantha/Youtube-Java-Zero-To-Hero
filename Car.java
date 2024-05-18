public class Car extends  Vehicle{

    String colour ;
    int no_of_tyres ;

    public Car(String c, int ty, int p , int f){
        super(p,f);
        colour = c;
        no_of_tyres = ty;
    }
    public void detail_of_car() {
        System.out.println("This is a car");
        System.out.println("My colour is : " + colour);
        System.out.println("I have :"+no_of_tyres+ "tyres");
    }
}

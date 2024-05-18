public class Vehicle {
    int price ;
    int fuel ;

    public Vehicle(int p, int f){
        price = p;
        fuel = f;
    }

    public void detail_of_vehicle(){
        System.out.println("This is vehicle");
        System.out.println("The price is " + price);
        System.out.println("I can drive "+fuel+ " kms per liter");
    }
}

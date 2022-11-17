

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String args[]){

        Car car = new Car("Audi A3", 180.000);
        System.out.println("First method");

        car.printCarDetails();
        car.getCarDetails();
    }

}
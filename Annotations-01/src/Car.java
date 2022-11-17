public class Car {
    public String modelName;
    public double mileage;

    public Car(String modelName, double mileage){
        this.modelName=modelName;
        this.mileage=mileage;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println("the modelName of car is " + modelName + " this car has " + mileage + " kilometres");
    }

    public void getCarDetails(){
        System.out.println("The modelName of car is " + modelName);
        System.out.println("This car has " + mileage + " kilometers");
    }

}

public class Animal {

    public String animalName;

    public Animal(String animalName){

    }

    public void animalSound(){
        System.out.println("Roarr!");
    }


    public void animalSound(String intensity){


        if (intensity == "High!"){
            System.out.println("Roarrrrrrrr!");
        } else if (intensity == "low!") {
            System.out.println("Roar");
        } else {
            System.out.println("error");
        }
    }

}

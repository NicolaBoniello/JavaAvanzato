

public class Main {

    public static void main(String args[]) {

        Animal animalDefault = new Animal("AnimalDefault");
        animalDefault.animalSound();
        Lion lion = new Lion("Leo");
        lion.animalSound();
        Cow cow = new Cow("Ferdinando");
        cow.animalSound();
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Person person = new Person();
        System.out.println("insert the name");
        person.setName(input.nextLine());
        System.out.println("insert the surname");
        person.setSurname(input.nextLine());
        System.out.println("insert the age");
        person.setAge(input.nextInt());
        System.out.println("insert the weight");
        person.setHeight(input.nextDouble());


        System.out.println("The name is " + String.format("%s" , person.getName())
                + " The surname is " + String.format("%s " , person.getSurname())
                + " The age is " + String.format("%d " , person.getAge())
                + " the weight is " + String.format("%.2f" , person.getHeight()));

    }

}
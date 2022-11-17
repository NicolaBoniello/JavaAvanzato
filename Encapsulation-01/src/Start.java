import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        House house = new House();
        Scanner input = new Scanner(System.in);
        System.out.println("insert the address ");
        house.setAddress(input.nextLine());
        System.out.println("insert the numbers of floors");
        house.setFloorsNumbers(input.nextInt());
        System.out.println("insert the name of resident");
        input.nextLine();
        house.setResidentsNames(input.nextLine().split(","));
        System.out.println("the address of house is " + String.format("%s" , house.getAddress())
                + " The number of floors is " + String.format("%d" , house.getFloorsNumbers())
                + " the name of the residents who live in the house "   + String.format("%s" , Arrays.toString(house.getResidentsNames())));
    }
}

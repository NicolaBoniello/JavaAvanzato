import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Month month[] = Month.values();
        for(int i=0; i < month.length; i++){
            if (month[i].toString().endsWith("Y")){
                System.out.println(month[i] + " ends with y");
            } else System.out.println(month[i] + " doesn't ends with y ");
        }
    }
}
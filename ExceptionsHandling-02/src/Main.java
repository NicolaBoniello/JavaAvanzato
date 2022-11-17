import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Main dividend = new Main();
        Main divisor = new Main();
        System.out.println("Insert the dividend");
        dividend.setDividend(input.nextInt());
        System.out.println("insert the divisor");
        try {
            dividend.setDivisor(input.nextInt());
            System.out.println("Succes");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("error");
        }



    }
    private int dividend;
    private int divisor;




    public void setDividend(int dividend)  {
        this.dividend = dividend;

    }


    public void setDivisor(int divisor) throws Exception {
        this.divisor = divisor;
        if (divisor <= 0){
            throw new Exception("not possible to divide by 0 or less");
        } else if (divisor > 0){
            System.out.println(dividend/divisor);
        }
    }
}
import java.util.Scanner;

public class TaxRunner {
    public static void main(String[]args){
        System.out.println("enter single:1 ,married:2");

        int income;
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();

        income=input.nextInt();
        input.close();
        Tax t=new Tax();
        double Tax=t.TaxCalculation(s,income);
        System.out.println("total tax="+Tax);
    }
}

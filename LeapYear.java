import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        System.out.println("enter a year:");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        boolean y=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    y=true;
                else
                    y=false;
            }
            else
                y=true;
        }
        else
            y=false;
        if(y==true)
            System.out.println(year+"is a leap year");
        else
            System.out.println(year+"is not a leap year");
    }
}


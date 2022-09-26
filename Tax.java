public class Tax {
    public static double TaxCalculation(int s,int income){
        double tax;
        if(s==1){
            if(income>=0 && income<=8000)
                tax=income*0.10;
            else if(income>8000 && income<=32000)
                tax=800+(income-8000)*(0.15);
            else
                tax=4400+(income-16000)*(0.25);
        }
        else
        {
            if(income>=0 && income<=16000)
                tax=income*(0.10);
            else if(income>16000 && income<=64000){
                tax=1600+(income-16000)*(0.15);
        }
            else
                tax=8800+(income-64000)*(0.25);
        }
        return tax;
    }
}

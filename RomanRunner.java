import java.util.Scanner;


    public class RomanRunner {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int num = in.nextInt();
            Roman Num = new Roman();
            Num.RomanValue(num);


        }
    }
}

}

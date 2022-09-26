
public class Roman {
    public static void RomanValue(int num)
    {
        int values[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String Letters[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        //String L[] = {};
        String roman = "";

        for (int i = 0;i < 13;i++)
        {
            while (num >= values[i])
            {
                num = num - values[i];
                //L[i] = Letters[i];
                roman += Letters[i];
            }
        }
        System.out.println("Roman Numbers: " + roman);
    }
}



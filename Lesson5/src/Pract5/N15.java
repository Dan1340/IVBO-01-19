package Pract5;

import java.util.Scanner;

public class N15
{
    public static void recursion(int N)
    {
        if(N>9)
        {
            System.out.print(N % 10 + " ");
            recursion(N/10);
        }
        else
            System.out.println(N);
    }
    N15()
    {
        Scanner a = new Scanner(System.in);
        recursion(a.nextInt());
    }
}

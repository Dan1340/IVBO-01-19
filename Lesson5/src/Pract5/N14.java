package Pract5;

import java.util.Scanner;

public class N14
{
    public static void recursion(int N, int k)
    {
        if(N<10)
            System.out.println(N);
        else if(N/k>9)
        {
            recursion(N,k*10);
        }
        else
        {
            System.out.print(N/k+" ");
            N %= k;
            recursion(N, k/10);
        }
    }

    N14()
    {
        Scanner a = new Scanner(System.in);
        recursion(a.nextInt(), 10);
    }
}

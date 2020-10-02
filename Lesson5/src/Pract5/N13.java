package Pract5;

import java.util.Scanner;

public class N13
{
    public static void recursion()
    {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        if(b!=0)
        {
            System.out.println("--" + b + "--");
            if(a.nextInt()!=0)
                recursion();
        }
    }
    N13()
    {
        recursion();
    }
}

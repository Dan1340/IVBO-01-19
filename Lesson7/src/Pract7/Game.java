package Pract7;
import java.util.*;

public class Game
{
    Queue<Integer> F = new LinkedList<Integer>();
    Queue<Integer> S = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);
    Game()
    {
        System.out.print("First: ");
        for(int i=0;i<5;i++)
            F.add(sc.nextInt());
        System.out.print("Second: ");
        for(int i=0;i<5;i++)
            S.add(sc.nextInt());
        for(int i=0;i<106;i++)
        {
            if((F.element()>S.element() && F.element()!=9 && S.element()!=0) || (F.element()==0 && S.element()==9))
            {
                F.add(F.element());
                F.add(S.element());
                F.remove();
                S.remove();
            }
            else if((F.element()<S.element() && S.element()!=9 && F.element()!=0) || (S.element()==0 && F.element()==9))
            {
                S.add(F.element());
                S.add(S.element());
                F.remove();
                S.remove();
            }

            if(F.isEmpty())
            {
                System.out.println("Second win  "+(i+1));
                break;
            }
            else if(S.isEmpty())
            {
                System.out.println("First win  "+(i+1));
                break;
            }
            else if(i==105)
                System.out.println("Botva");
        }
    }
}

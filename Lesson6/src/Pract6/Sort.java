package Pract6;

import java.util.Arrays;

public class Sort
{
    Sort(Student[] list)
    {
        for (int left = 0; left < list.length; left++)
        {
            Student t = list[left];
            int i=left-1;
            for (; i >= 0; i--)
            {
                if (t.getID() < list[i].getID())
                {
                    list[i + 1] = list[i];
                }
                else
                    break;
            }
            list[i + 1] = t;
        }
    }
}

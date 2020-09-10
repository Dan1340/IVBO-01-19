package L2;

import P2.Author;

import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Book A = new Book("Д.Толкин", "Хоббит", 1937, 34, true);
        System.out.println(A);
        Book B = new Book("Л.Толстой", "Война и мир", 1867, 0, false);
        System.out.println(B);
        System.out.print("Замените номер: ");
        Scanner a = new Scanner(System.in);
        B.setNumber(a.nextInt());
        B.setAvailability(true);
        System.out.println(B);
    }
}

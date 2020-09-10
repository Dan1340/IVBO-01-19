package P2;

import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author A = new Author("Борис Иванов", "ivanov.b2020@mail.com", 'М');
        System.out.println(A);
        A.getEmail();
        System.out.print("Замените почту: ");
        Scanner a = new Scanner(System.in);
        A.setEmail(a.nextLine());
        System.out.println(A);
    }
}

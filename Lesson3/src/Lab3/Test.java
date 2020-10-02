package Lab3;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите породу собаки: ");
        String breed = a.nextLine();
        System.out.print("Введите кличку собаки: ");
        String nickname = a.nextLine();
        System.out.print("Введите возраст собаки: ");
        int age = a.nextInt();
        System.out.print("Введите вес собаки: ");
        int weight = a.nextInt();
        if(breed.equals("овчарка"))
        {
            Shepherd A = new Shepherd(nickname, age, weight);
            A.Data();
        }
        else if(breed.equals("борзая"))
        {
            Greyhound A = new Greyhound(nickname, age, weight);
            A.Data();
        }
        else if(breed.equals("терьер"))
        {
            Terrier A = new Terrier(nickname, age, weight);
            A.Data();
        }
    }
}

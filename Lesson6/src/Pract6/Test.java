package Pract6;

public class Test
{
    public static void main(String[] args)
    {
        Student a = new Student("Петров", 1);
        Student b = new Student("Иванов", 3);
        Student c = new Student("Дятлов", 24);
        Student d = new Student("Иванов", 12);
        Student e = new Student("Пушкин", 11);
        Student[] list = new Student[]{a, b, c, d, e};
        for(Student i : list)
        {
            i.toString();
        }
        System.out.println("\nСортировка:");
        new Sort(list);
        for(Student i : list)
        {
            i.toString();
        }
    }
}

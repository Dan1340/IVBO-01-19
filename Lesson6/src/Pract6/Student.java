package Pract6;

public class Student
{
    String name;
    int id;
    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getID()
    {
        return this.id;
    }
    public String toString()
    {
        System.out.println(getID()+" "+getName());
        return null;
    }
}

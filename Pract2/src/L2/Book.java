package L2;

public class Book
{
    private String author;
    private String name;
    private int year;
    private int number;
    private boolean availability;

    public Book(String author, String name, int year, int number, boolean availability)
    {
        this.author = author;
        this.name = name;
        this.year = year;
        this.number = number;
        this.availability = availability;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public int getNumber()
    {
        return number;
    }
    public boolean getAvailability()
    {
        return availability;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public void setAvailability(boolean availability)
    {
        this.availability = availability;
    }
    public String toString()
    {
        if(getAvailability())
            return "Книга: "+getAuthor()+" \""+getName()+"\", "+getYear()+"("+getNumber()+") - присутствует";
        else
            return "Книга: "+getAuthor()+" \""+getName()+"\", "+getYear()+"("+getNumber()+") - отсутсвует";
    }
}

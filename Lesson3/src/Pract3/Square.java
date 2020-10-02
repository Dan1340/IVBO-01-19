package Pract3;

class Square extends Rectangle
{
    public Square()
    {
        this.width = 1;
        this.length = 1;
    }
    public Square(double side)
    {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.setColor(color);
        this.setFilled(filled);
        this.width = side;
        this.length = side;
    }
    public double getSide()
    {
        return this.length;
    }
    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side)
    {
        this.width = side;
    }
    public void setLength(double side)
    {
        this.length = side;
    }
    public String toString()
    {
        return "Форма: квадрат\nСторона: "+this.length+"\nЦвет: "+super.getColor();
    }
}

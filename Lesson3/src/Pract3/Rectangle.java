package Pract3;

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.width = 2;
        this.length = 3;
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return this.length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*width+2*length;
    }
    public String toString()
    {
        return "Форма: прямоугольник\nШирина: "+this.width+"\nДлина: "+this.length+"\nЦвет: "+super.getColor();
    }
}

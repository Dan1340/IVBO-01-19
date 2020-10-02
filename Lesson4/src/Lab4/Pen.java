package Lab4;

class Pen implements Priceable
{
    String color;
    int price;
    Pen(int price)
    {
        this.color = "blue";
        this.price = price;
    }
    Pen(String color, int price)
    {
        this.color = color;
        this.price = price;
    }
    public String Info()
    {
        return "Ручка "+this.color;
    }
    public int getPrice()
    {
        return this.price;
    }
}

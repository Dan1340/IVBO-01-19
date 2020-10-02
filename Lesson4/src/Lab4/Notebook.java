package Lab4;

class Notebook implements Priceable
{
    String format;
    int price;
    Notebook(int price)
    {
        this.format = "A5";
        this.price = price;
    }
    Notebook(String format,int price)
    {
        this.format = format;
        this.price = price;
    }
    public String Info()
    {
        return "Тетрадь "+this.format;
    }
    public int getPrice()
    {
        return this.price;
    }
}

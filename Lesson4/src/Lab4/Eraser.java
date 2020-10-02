package Lab4;

class Eraser implements Priceable
{
    String size;
    int price;
    Eraser(int price)
    {
        this.size = "middle";
        this.price = price;
    }
    Eraser(String size, int price)
    {
        this.size = size;
        this.price = price;
    }
    public String Info()
    {
        return "Ластик "+this.size;
    }
    public int getPrice()
    {
        return this.price;
    }
}

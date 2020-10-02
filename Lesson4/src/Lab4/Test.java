package Lab4;

public class Test
{
    public static void main(String[] args)
    {
        Priceable A = new Pen(50);
        Priceable B = Create("Eraser", "small", 20);
        Priceable C = Create("Notebook", "A5", 30);
        System.out.println("Товары:");
        System.out.println(A.Info()+": "+A.getPrice());
        System.out.println(B.Info()+": "+B.getPrice());
        System.out.println(C.Info()+": "+C.getPrice());
    }
    static Priceable Create(String name, String character, int price)
    {
        if(name == "Pen")
            return new Pen(character, price);
        else if(name == "Eraser")
            return new Eraser(character, price);
        else
            return new Notebook(character, price);
    }
}

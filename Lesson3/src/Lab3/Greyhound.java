package Lab3;

class Greyhound extends Dog
{
    private String size;
    public Greyhound(String nickname, int age, int weight)
    {
        super(nickname, age, weight);
        this.size = "средняя";
    }
    public void Data()
    {
        System.out.println("Характеристика:");
        System.out.println("Порода: борзая");
        System.out.println("Кличка: "+super.getNickname());
        System.out.println("Размер: "+size);
        System.out.println("Возраст: "+super.getAge());
        System.out.println("Вес: "+super.getWeight());
    }
}

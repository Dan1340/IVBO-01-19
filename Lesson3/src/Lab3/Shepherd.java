package Lab3;

class Shepherd extends Dog
{
    private String size;
    public Shepherd(String nickname, int age, int weight)
    {
        super(nickname, age, weight);
        this.size = "большая";
    }
    public void Data()
    {
        System.out.println("Характеристика:");
        System.out.println("Порода: овчарка");
        System.out.println("Кличка: "+super.getNickname());
        System.out.println("Размер: "+size);
        System.out.println("Возраст: "+super.getAge());
        System.out.println("Вес: "+super.getWeight());
    }
}

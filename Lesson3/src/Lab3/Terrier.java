package Lab3;

class Terrier extends Dog
{
    private String size;
    public Terrier(String nickname, int age, int weight)
    {
        super(nickname, age, weight);
        this.size = "маленькая";
    }
    public void Data()
    {
        System.out.println("Характеристика:");
        System.out.println("Порода: терьер");
        System.out.println("Кличка: "+super.getNickname());
        System.out.println("Размер: "+size);
        System.out.println("Возраст: "+super.getAge());
        System.out.println("Вес: "+super.getWeight());
    }
}

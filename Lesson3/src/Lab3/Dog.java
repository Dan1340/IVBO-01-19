package Lab3;

public abstract class Dog
{
    private String nickname;
    private int age;
    private int weight;

    public String getNickname()
    {
        return nickname;
    }
    public int getAge()
    {
        return age;
    }
    public int getWeight()
    {
        return weight;
    }

    public Dog(String nickname, int age, int weight)
    {
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
    }
    public abstract void Data();
}

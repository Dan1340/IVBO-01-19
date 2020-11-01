package Lab7;
import java.util.ArrayList;

public class AL
{
    AL()
    {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Австралия");
        states.add("Франция");
        states.add("Сингапур");
        states.add("Испания");
        states.add(1, "Китай");
        System.out.println(states.get(1));
        System.out.println();
        states.set(1, "Бразилия");
        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println();
        for (String state : states)
        {
            System.out.println(state);
        }
        System.out.println();
        if (states.contains("Австралия"))
        {
            System.out.println("Список содержит государство Австралия");
        }
        System.out.println();
        states.remove("Испания");
        states.remove(0);
        Object[] countries = states.toArray();
        for (Object country : countries)
        {
            System.out.println(country);
        }
    }
}

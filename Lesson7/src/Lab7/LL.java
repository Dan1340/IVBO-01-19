package Lab7;

import java.util.LinkedList;

public class LL
{
    LL()
    {
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Майк"));
        people.addFirst(new Person("Том"));
        people.addLast(new Person("Ник"));
        people.remove(1);
        for(Person p : people)
        {
            System.out.println(p.getName());
        }
        System.out.println();
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}

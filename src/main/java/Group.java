import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Person> persons;

    public Group() {
        persons = new ArrayList<>();
    }

    public boolean add(Person person) {
        return persons.add(person);
    }

    public boolean del(Person person) {
        return persons.remove(person);
    }

    public Person get(int position) throws IndexOutOfBoundsException {
        return persons.get(position);
    }

    public Person max(){
        if (persons.size() == 0) {
            throw new IndexOutOfBoundsException("There is no element.");
        }
        Person max = persons.get(0);
        for (Person person : persons) {
            if (person.getAge() > max.getAge()) {
                max = person;
            }
        }
        return max;
    }
}

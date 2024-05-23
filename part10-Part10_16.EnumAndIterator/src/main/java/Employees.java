import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (int i = 0; i < peopleToAdd.size(); i++) {
            list.add(peopleToAdd.get(i));
        }
    }

    public void print() {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();

            if (nextInLine.getEducation() == education) {
                // removing from the list the element returned by the previous next-method call
                System.out.println(nextInLine);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                // removing from the list the element returned by the previous next-method call
                iterator.remove();
            }
        }
    }
}

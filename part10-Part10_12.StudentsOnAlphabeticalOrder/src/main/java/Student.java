
public class Student implements Comparable<Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student toCompare){
        String name1 = toCompare.getName();
        if (this.name.compareToIgnoreCase(name1) == 0){
            return 0;
        } else
        return this.name.compareToIgnoreCase(name1);
    }
}

public class Book implements Comparable<Book>{
    private String name;
    private int age;
    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return getName() + " (recommended for " + getAge() + " year-olds or older)";
    }
    public int compareTo(Book book) {
        String a = book.getName();
        if (this.age == book.getAge() && this.name.compareToIgnoreCase(a) == 0) {
            return 0;
        }else if (this.name.compareToIgnoreCase(a) != 0 && this.age == book.getAge()){
            return this.name.compareToIgnoreCase(a);
        }else if (this.age > book.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}

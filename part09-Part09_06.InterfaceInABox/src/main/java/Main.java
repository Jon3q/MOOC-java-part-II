public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box1 = new Box(20);


        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 3));



        box1.add(box);
        System.out.println(box1);
        box.add(new Book("Kent Beck", "Test Driven Development", 3));
        System.out.println(box1);
    }
}
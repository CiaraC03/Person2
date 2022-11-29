package ie.atu;

public class PersonApp {
    public static void main(String[] args) {
        Person dave = new Person("Dave", "Mervue", "12345");
        System.out.println(dave.toString());
        Customer peter = new Customer("Dave", "Mervue", "12345", "78999", true);
        System.out.println(peter.toString());
    }
}

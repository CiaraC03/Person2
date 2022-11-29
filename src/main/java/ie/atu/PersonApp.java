package ie.atu;

public class PersonApp {
    public static void main(String[] args) {
        Person dave = new Person("Dave", "Mervue", "12345");
        System.out.println(dave.toString());
        Customer peter = new Customer("Dave", "Mervue", "12345", "78999", true);
        System.out.println(peter.toString());

        Customer brian = new Customer();
        brian.setName("Brian");
        brian.setAddress("Peru");
        brian.setNumber("987654");

        System.out.println("Name : "+ brian.getName() + "Address : " + brian.getAddress() + "Number : " + brian.getNumber());
    }




}


class Laptop {

    public void displayDetails(String brand,int ram,double price) {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class LaptopC {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();

        l1.displayDetails("Dell",16,30000);
        l2.displayDetails("HP",8,45000);
        l3.displayDetails("Asus",16,55000);
    }
}

class Car{
    String brand;
    String model;
    double amount;
    void display()
    {
        System.out.println("BRAND:" +brand);
        System.out.println("MODEL:" +model);
        System.out.println("AMOUNT:" +amount);
        System.out.println();
    }

}
public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand="Audi";
        c1.model="A1";
        c1.amount=200000;
        
        Car c2 =new Car();
        c2.brand="Honda";
        c2.model="B1";
        c2.amount=250000;

        Car c3 = new Car();
        c3.brand="Tesla";
        c3.model="C1";
        c3.amount=255000;
        
        c1.display();
        c2.display();
        c3.display();

    }
    
}

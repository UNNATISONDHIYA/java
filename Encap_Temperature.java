class temperature{
    private double celsius;
    public void setCelsius(double celsius )
    {
        this.celsius=celsius;
    }
    public double getFahrenheit()
    {
        return (celsius*9/5)+32;
    }
}
public class Encap_Temperature {
    public static void main(String[] args) {
    temperature obj = new temperature();
    obj.setCelsius(35);
    System.out.println("Fahrenheit:" + obj.getFahrenheit());
    }

    
    
}

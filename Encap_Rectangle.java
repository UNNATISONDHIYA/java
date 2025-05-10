class Rectangle{
    private int l;
    private int w;
    public void setfields(int length,int width)
    {
        this.l=length;
        this.w=width;
    }
    public int getArea()
    {
        return l*w;
    }
    public int getPerimeter()
    {
        return 2*(l+w);
    }

}
public class Encap_Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setfields(4, 5);
        System.out.println("Area:" + r.getArea());
        System.out.println("Perimeter:" +r.getPerimeter());
        
    }
    
}

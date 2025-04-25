public class variables {
    int a=8; //instance variable
    static int b =10; //static variable
    public static void main(String[] args) {
        int c=12;  //local variable
        variables obj = new variables();  //for instance variable
        System.out.println("Instance Variable:" +obj.a);        //instance variable
        System.out.println("Static Variable:" +variables.b);  //static variable(using class name)
        System.out.println("Local Variable:" +c);            //local variable
    }
    
}

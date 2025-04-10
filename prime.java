public class prime {
    public static void main(String[] args) {
    int n=7;
    boolean isprime = true;
    for( int i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            isprime =false;
            break;
        }
    }
    System.out.println(isprime ? "prime" : "not prime");
    
}
}

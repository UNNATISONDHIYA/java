public class Countevenodd {
    public static void main(String[] args) {
        int n = 123;
        int counteven=0, countodd=0;
        while(n>0)
        {
            int d=n%10;
            if(d%2==0)
            {
                counteven++;
            }
            else{
                countodd++;
            }
            n/=10;
        }
        System.out.print("even count: "+counteven);
        System.out.println();
        System.out.print("odd count: "+countodd);
    }
    
}

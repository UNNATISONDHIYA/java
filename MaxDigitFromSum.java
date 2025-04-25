public class MaxDigitFromSum {
    static int findmax(int num)
    {
        int max = 0;
        while(num>0)
        {
            int d=num%10;
            if(d>max)
            {
                max=d;
            }
            num/=10;
        }
        return max;

    }
    public static void main(String[] args) {
        int a=200;
        int b=4;
        int sum = a+b;
        System.out.println("SUM:" + sum);
        int output = findmax(sum);
        System.out.println("Maximum digit from sum:" + output);
    
    }
}

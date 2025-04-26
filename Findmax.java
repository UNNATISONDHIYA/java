public class Findmax {
        static int Maxnum(int[] arr)
        {
            int max = arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if (max<arr[i])
                {
                    max=arr[i];
                }
            }
            return max;
        }
        public static void main(String[] args) {
            int[] arr ={99,90,67,95,78};
            int output = Maxnum(arr);
            System.out.println("Largest Number:" +output);
        }
        
    
    
}

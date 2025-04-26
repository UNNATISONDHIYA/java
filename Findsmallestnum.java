public class Findsmallestnum {
    static int smallestnum(int[] arr)
    {
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr ={2,45,67,22,23};
        int output = smallestnum(arr);
        System.out.println("Smallest Number:" +output);
    }
    
}

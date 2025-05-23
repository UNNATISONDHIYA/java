public class Exception_Handling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Exception Occurred:" +e);
        }finally{
            System.out.println("process completed !!");
        }
    }
}

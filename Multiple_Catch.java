public class Multiple_Catch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5]=30/0;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception Occurred");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }catch(Exception e){
            System.out.println("General Exception:" +e.getMessage());

        }
    }
    
}

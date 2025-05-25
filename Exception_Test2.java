public class Exception_Test2 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("Caught a null pointer exception!" +e);
        }
    }
    
}


public class CommonLetters {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        int count = 0;
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
            if(str1.charAt(i)==str2.charAt(j))
            count++;
            }
        }
        System.out.print(count);
    }
    
}

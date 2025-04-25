 public class UseofStringbuilder {
     public static void main(String[] args) {
      // StringBuilder str=new StringBuilder("hello ");
         StringBuilder str=new StringBuilder("hello ");  //mutable(string ko change karta hai)
           //old*2+2(capacity)
         str.append("hello hiii bye");
         System.out.println(str.length());
         //System.out.println(str.capacity());
         System.out.println(str);
     }
 }

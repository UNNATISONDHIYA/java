 class downloadFile extends Thread
 {
     String filename;
     public downloadFile(String filename)
     {
         this.filename=filename;
    }
     public void run()
    {
         for(int i=0;i<=5;i++)
         {
             System.out.println(filename + " downloading..." + (i*20) + "%");
         try {
             Thread.sleep(2000);
         } catch (Exception e) {
        }
         }
         System.out.println(filename +  " done");
     }
 }
public class Multithread1 {
     public static void main(String[] args) 
         {
         downloadFile f1 = new downloadFile("File A");
         downloadFile f2 = new downloadFile("File B");
         f1.start();
         f2.start();
     }
    
}


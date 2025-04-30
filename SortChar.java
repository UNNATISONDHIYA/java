public class SortChar  {
    public static void Sort()
    {
        String[] str={"B","A","C","E","D","H","G","F"};
        for(int i=0;i<str.length-1;i++)
        {
            for(int j=0;j<str.length-1-i;j++)
            {
                if((int)str[j].charAt(0)>(int)str[j+1].charAt(0))
                {
                   String temp=str[j];
                   str[j]=str[j+1];
                   str[j+1]=temp;
                }
            }

        }
        for (String s : str)
        {
            System.out.println(s + " ");
        }
    }
    public static void main(String[] args) {
        
        Sort();
        
    }
    
}

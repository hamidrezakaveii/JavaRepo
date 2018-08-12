
package selfclass;
import java.util.Scanner;
public class ArrayStringCount {
    
    public static void main(String[] args){
        String[] names = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<names.length;i++)
        names[i] = in.nextLine();
        System.out.println("Number of Mr. : "+getStringCount(names));
        
    }
    
    static int getStringCount(String[] names){
        int count=0;
        String name="mr.";
        for(int i=0;i<names.length;i++)
        if (names[i].startsWith(name))
            count+=1;
        else
            continue;
        return count;
        
    }
}

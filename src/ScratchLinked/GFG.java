package ScratchLinked;
import java.io.*;


public class GFG {
    
    public static void main(String[] args){
        
        //Create ScratchLinked list
        ScratchList<Integer> list1 = new ScratchList<Integer>(); 
        System.out.println("Integer list created as list1");

        //add items to the list1
        list1.add(100);
        list1.add(200);
        list1.add(300);

        System.out.println(list1.toString());

        list1.remove(200);
        System.out.println(list1.toString()); 

    }
}

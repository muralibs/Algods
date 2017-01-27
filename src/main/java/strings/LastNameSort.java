/*
 * http://algorithms.tutorialhorizon.com/sort-names-by-their-last-names/
 */
package strings;

import java.util.ArrayList;
import  java.util.*;

public class LastNameSort {
    
    public void sortLastName(ArrayList<String> a)  {
        
        Collections.sort(a, new Comparator<String>() {
           @Override
           public int compare(String o1,String o2) {
               
               String[] o1Arr = o1.split(" ");
               String[] o2Arr = o2.split(" ");
               
               return o1Arr[1].compareTo(o2Arr[1]);
               
           }
           
        });
        System.out.println("output : " + a);
    }
}

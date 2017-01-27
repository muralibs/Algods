/*
 * http://algorithms.tutorialhorizon.com/level-order-traversal-in-zig-zag-pattern-or-print-in-spiral-pattern/
 */
package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeZigZag {
    
    private ArrayList<Integer> al = new ArrayList<>();
    private boolean evenLevel;
     
    public void zigZag(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root == null) return;
       
        int level =0;
        q.add(root);
        
        while(!q.isEmpty()) {
            level = q.size();
            al.clear();
            while(level > 0) {
                Node tmp = q.remove();
                al.add(tmp.data);
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
                level--;
            }
            if(evenLevel) {
                System.out.println(al);
                evenLevel = !evenLevel;
            } else {
                Collections.reverse(al);
                System.out.println(al);
                evenLevel =  !evenLevel;
            }
            
            
        }
        
    }
}

/*
 * http://algorithms.tutorialhorizon.com/level-order-traversal-print-each-level-in-separate-line/
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelByLevel {
    
    public void bfs(Node root) {
        int level = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            level = q.size();
            
            while(level > 0) {
                Node tmp = q.remove();
                System.out.print(" " + tmp.data);
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
                level--;
            }
            System.out.println("");
        }
        
    }
}

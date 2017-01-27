package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    
    public void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        //check if root is not null
        q.add(root);
        
        while (!q.isEmpty()) {
            Node tmp = q.poll();
            
            System.out.print(" " + tmp.data);
            
            if(tmp.left != null) q.add(tmp.left);
            if(tmp.right != null ) q.add(tmp.left);
        }
        
    }
}

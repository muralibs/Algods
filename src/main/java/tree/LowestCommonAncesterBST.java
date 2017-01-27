/*
 * https://www.youtube.com/watch?v=TIoCCStdiFo&list=PLrmLmBdmIlpv_jNDXtJGYTPNQ2L1gdHxu&index=16
 */
package tree;

public class LowestCommonAncesterBST {
    
    public Node LCA(Node root, Node node1, Node node2) {
        
        if(root.data > Math.max(node1.data, node2.data)) {
            return LCA(root.left, node1, node2);
        } else if(root.data < Math.min(node1.data, node2.data)) {
            return LCA(root.right, node1, node2);
        } else {
            return root;
        }
    }

}

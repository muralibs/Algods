package tree;

public class FindTreeHeight {
    
    public int getTreeHeight(Node root) {
        
        if(root == null) {
            return 0;
        } else {
            return 1 + Math.max(getTreeHeight(root.left), getTreeHeight(root.right));
        }
        
    }
    
    
    public int getNodeHeight(Node root, Node node, int height) {
        if(node == null) return 0;
        if(root == node) return height;
        
        int level = getNodeHeight(root.left, node, height+1);
        
        if(level != 0) return level;
        
        return getNodeHeight(root.right, node, height+1);
    }
    
}

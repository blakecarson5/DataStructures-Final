
public class BSTNode {
    private Character val;
    private BSTNode left;
    private BSTNode right;
    
    public BSTNode(){
        val = null;
        left = null;
        right = null;
    }
    
    public BSTNode(Character val){
        this.val = val;
        left = null;
        right = null;
    }
    
    public BSTNode(Character val, BSTNode left, BSTNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    public Character value(){
        return val;
    }
    
    public void setValue(Character c){
        val = c;
    }
    
    public void setLeft(BSTNode n){
        left = n;
    }
    
    public void setRight(BSTNode n){
        right = n;
    }
    
    public BSTNode left(){
        return left;
    }
    
    public BSTNode right(){
        return right;
    }
    
    public boolean isLeaf(){
        return (left == null && right == null);
    }
}


public class BinSearchTreeImp implements BinSearchTreeADT {

    private BSTNode root;
    
    public BinSearchTreeImp(){
        root = null;
    }
    
    @Override
    public BinSearchTreeADT add(Character c) {
        root = addHelp(root, c);
        return this;
    }

    private BSTNode addHelp(BSTNode n, Character c) {
        if(n == null){
            return new BSTNode(c);
        }
        
        if(n.value() > c){
            n.setLeft(addHelp(n.left(), c));
        }
        
        else if(n.value() < c){
            n.setRight(addHelp(n.right(), c));
        }
        
        return n;
    }

    @Override
    public Integer countOf(Character c) {
        return countHelp(root, c);
    }

    private Integer countHelp(BSTNode n, Character c) {
        if(n == null){
            return 0;
        }
        
        int total = 0;
        
        if(n.value() < c){
            total = 1;
        }
        
        return total + countHelp(n.left(), c) + countHelp(n.right(), c);
    }

    @Override
    public Integer height() {
        return heightHelp(root);
    }

    private Integer heightHelp(BSTNode n) {
        if(n == null){
            return 0;
        }
        
        int heightL = 1;
        int heightR = 1;
        
        heightL = heightL + heightHelp(n.left());
        heightR = heightR + heightHelp(n.right());
        
        if(heightL > heightR){
            return heightL;
        }
        
        return heightR;
    }

    @Override
    public BinSearchTreeADT mkFull() {
        root = new BSTNode('d');
        BSTNode b = new BSTNode('b');
        root.setLeft(b);
        BSTNode a = new BSTNode('a');
        b.setLeft(a);
        BSTNode c = new BSTNode('c');
        b.setRight(c);
        BSTNode f = new BSTNode('f');
        root.setRight(f);
        BSTNode e = new BSTNode('e');
        f.setLeft(e);
        BSTNode g = new BSTNode('g');
        f.setRight(g);

        return this;
    }

    @Override
    public String preorder() {
        return preorderHelp(root);
    }
    
    public String toString(){
        return preorder();
    }

    private String preorderHelp(BSTNode n) {
        if(n == null){
            return "";
        }
        
        String out = n.value().toString();
        
        out = out + preorderHelp(n.left());
        out = out + preorderHelp(n.right());
        
        return out;
    }

    @Override
    public BinSearchTreeADT remove(Character c) {
        root = removeHelp(root, c);
        return this;
    }

    private BSTNode removeHelp(BSTNode n, Character c) {
        if(n == null){
            return null;
        }
        
        if(n.value() > c){
            n.setLeft(removeHelp(n.left(), c));
        }
        
        else if(n.value() < c){
            n.setRight(removeHelp(n.right(), c));
        }
        
        else {
            if(n.left() == null){
                return n.right();
            }
            
            else if (n.right() == null){
                return n.left();
            }
            
            else {
                BSTNode temp = getMax(n.left());
                n.setValue(temp.value());
                n.setLeft(deleteMax(n.left()));
                
            }
        }
        
        return n;
    }
    
    private BSTNode getMax(BSTNode n) {
        if(n.right() == null){
            return n;
        }
        
        return getMax(n.right());
    }
    
    private BSTNode deleteMax(BSTNode n) {
        if(n.right() == null){
            return n.left();
        }
        
        n.setRight(deleteMax(n.right()));
        return n;
    }

    

    
}

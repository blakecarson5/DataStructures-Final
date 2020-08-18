import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class of BinSearchTreeImp.java
 * 
 * @author Blake Carson
 * @version 120517
 */
public class BinSearchTreeTest {

    /**
     * doesBinSearchTreeAddCorrectlyBaseCase. --- Checks to see if the add()
     * method correctly adds a BSTNode for its base case.
     */
    @Test
    public void doesBinSearchTreeAddCorrectlyBaseCase() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('a');

        String out = "a";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeAddNoRepeats. --- Makes sure the add() method does not
     * add any values already in the Binary Search Tree.
     */
    @Test
    public void doesBinSearchTreeAddNoRepeats() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('a');
        tree.add('a');

        String out = "a";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeAddCorrectly. --- A simple test of the add() method to
     * see if it correctly places the values where they need to be when
     * inserted.
     */
    @Test
    public void doesBinSearchTreeAddCorrectly() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('a');
        tree.add('b');
        tree.add('c');

        String out = "abc";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeAddCorrectlyADTExample. --- Tests to see if the add()
     * method can correctly build the example BST shown in the ADT.
     */
    @Test
    public void doesBinSearchTreeAddCorrectlyADTExample() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('f');
        tree.add('e');
        tree.add('a');
        tree.add('g');

        String out = "dbafeg";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeRemoveCorrectlyADTExample. --- Tests to see if the
     * remove() method can correctly remove the value such that the result is
     * exactly as the ADT example.
     */
    @Test
    public void doesBinSearchTreeRemoveCorrectlyADTExample() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('f');
        tree.add('c');
        tree.add('e');
        tree.add('a');
        tree.add('g');
        tree.remove('c');

        String out = "dbafeg";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeRemoveFailIfValueIsNotInTheTree. --- Tests to see if the
     * remove() method fails silently if the value to be removed is not in the
     * BST.
     */
    @Test
    public void doesBinSearchTreeRemoveFailIfValueIsNotInTheTree() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('f');
        tree.add('e');
        tree.add('a');
        tree.add('g');
        tree.remove('c');

        String out = "dbafeg";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeRemoveNodeRightIsNullCase. --- Tests on of the cases of
     * remove() when the root is removed and the right kid is null.
     */
    @Test
    public void doesBinSearchTreeRemoveNodeRightIsNullCase() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.remove('d');

        String out = "b";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeRemoveRoot. --- Checks to see if the remove() method can
     * correctly remove the root of an single node BST.
     */
    @Test
    public void doesBinSearchTreeRemoveRoot() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('a');
        tree.remove('a');

        String out = "";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeRemoveCorrectlyMkFull. --- Checks to see if the remove()
     * method can correctly remove the root of the mkFull() tree.
     */
    @Test
    public void doesBinSearchTreeRemoveCorrectlyMkFull() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.mkFull();
        tree.remove('d');

        String out = "cbafeg";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesBinSearchTreeRemoveRootAndSetRootDotLeft. --- Checks to see if the
     * remove() method can correctly remove the root who has a right and left
     * kid such that the left kid becomes the new root.
     */
    @Test
    public void doesBinSearchTreeRemoveRootAndSetRootDotLeft() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('b');
        tree.add('a');
        tree.add('c');
        tree.remove('b');

        String out = "ac";

        assertEquals(out, tree.preorder());
    }

    /**
     * doesCountOfReturnCorrectValueADTExample. --- Runs a duplicate of the ADT
     * BST and checks to see if the output of countOf() would be the same as the
     * ADT example.
     */
    @Test
    public void doesCountOfReturnCorrectValueADTExample() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('f');
        tree.add('c');
        tree.add('e');
        tree.add('a');
        tree.add('g');

        Integer out = 5;

        assertEquals(out, tree.countOf('f'));
    }

    /**
     * doesCountOfReturnZeroWhenRootIsNull. --- Checks to see if the result of
     * countOf() is 0 if the BST is empty.
     */
    @Test
    public void doesCountOfReturnZeroWhenRootIsNull() {
        BinSearchTreeImp tree = new BinSearchTreeImp();

        Integer out = 0;

        assertEquals(out, tree.countOf('a'));
    }

    /**
     * doesCountOfReturnZeroWhenNoValueIsLessThanParam. --- Checks to see if the
     * result of countOf() is 0 if the param value is the minimum value when
     * compared to the values of the BST.
     */
    @Test
    public void doesCountOfReturnZeroWhenNoValueIsLessThanParam() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('f');
        tree.add('c');
        tree.add('e');
        tree.add('a');
        tree.add('g');

        Integer out = 0;

        assertEquals(out, tree.countOf('a'));
    }

    /**
     * doesHeightEqualLeftHeightIfLeftIsGreaterSize. --- Checks to see if the
     * height equals the height of the left side of the tree if that side is
     * larger than the right.
     */
    @Test
    public void doesHeightEqualLeftsHeightIfLeftIsGreaterSize() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('a');
        tree.add('c');
        tree.add('f');

        Integer out = 3;

        assertEquals(out, tree.height());
    }

    /**
     * doesHeightEqualRightHeightIfRightIsGreaterSize. --- Checks to see if the
     * height equals the height of the right side of the tree if that side is
     * larger than the left.
     */
    @Test
    public void doesHeightEqualRightsHeightIfRightIsGreaterSize() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('d');
        tree.add('b');
        tree.add('e');
        tree.add('f');
        tree.add('g');

        Integer out = 4;

        assertEquals(out, tree.height());
    }

    /**
     * doesHeightEqualZeroIfTreeIsEmpty. --- Checks to see if zero is returned
     * when the BST is empty when the height() method is called.
     */
    @Test
    public void doesHeightEqualZeroIfTreeIsEmpty() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        Integer out = 0;

        assertEquals(out, tree.height());
    }

    /**
     * doesHeightEqualOneIfTreeIsJustTheRoot. --- Checks to see if one is
     * returned when the root is the only node present in the BST when height()
     * is called.
     */
    @Test
    public void doesHeightEqualOneIfTreeIsJustTheRoot() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.add('a');
        Integer out = 1;

        assertEquals(out, tree.height());
    }

    /**
     * doesTreeMkFull. --- Tests the MkFull() method to see if it can correctly
     * create the BST in the ADT.
     */
    @Test
    public void doesTreeMkFull() {
        BinSearchTreeImp tree = new BinSearchTreeImp();
        tree.mkFull();

        assertEquals("dbacfeg", tree.toString());
    }

    /**
     * doesBSTNodeContructNullRootValAndNullKids. --- Tests the default
     * constructor of BSTNode where the parent value is null and its left and
     * right kid are also null.
     */
    @Test
    public void doesBSTNodeConstructNullRootValAndNullKids() {
        BSTNode n = new BSTNode();
        assertEquals(null, n.value());
        assertEquals(null, n.left());
        assertEquals(null, n.right());
    }

    /**
     * doesBSTNodeContructRootAndKids. --- Tests one of BSTNode's constructors
     * where the root value is assigned and the left and right kid are
     * initialized to a specific BSTNode.
     */
    @Test
    public void doesBSTNodeConstructRootAndKids() {
        BSTNode a = new BSTNode('a');
        BSTNode b = new BSTNode('b');
        BSTNode n = new BSTNode('c', a, b);
        Character c = 'c';
        Character x = 'b';
        Character y = 'a';
        assertEquals(c, n.value());
        assertEquals(y, n.left().value());
        assertEquals(x, n.right().value());
    }

    /**
     * doesBSTNodeIsLeaf. --- Tests the isLeaf() method when the value is a leaf
     * of the BST. Must return true.
     */
    @Test
    public void doesBSTNodeIsLeaf() {
        BSTNode n = new BSTNode('n');
        assertTrue(n.isLeaf());
    }

    /**
     * doesBSTNodeIsNotLeafLeft. --- Tests the isLeaf() method when the value is
     * not a leaf of the BST. Must return false.
     */
    @Test
    public void doesBSTNodeIsNotLeafLeft() {
        BSTNode n = new BSTNode('n');
        n.setLeft(new BSTNode('b'));
        assertFalse(n.isLeaf());
    }

    /**
     * doesBSTNodeIsNotLeafRight. --- Tests the isLeaf() method when the value
     * is not a leaf of the BST. Must return false.
     */
    @Test
    public void doesBSTNodeIsNotLeafRight() {
        BSTNode n = new BSTNode('n');
        n.setRight(new BSTNode('b'));
        assertFalse(n.isLeaf());
    }
}
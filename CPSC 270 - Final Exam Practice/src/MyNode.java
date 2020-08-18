/**
 * This class is used by LinkedLisp and simulates a Node/Link in a Linked List.
 * 
 * @author Blake Carson
 * @version 20171008 bac MyNode methods implemented and tested.
 */
public class MyNode {
    private MyNode nextN;
    private Object val;

    /**
     * MyNode Constructor: Sets the MyNode's value to Object val and sets the
     * next MyNode to MyNode nextN.
     * 
     * @param val
     *            Value assigned to MyNode's val.
     * @param nextN
     *            The next node in MyNode.
     */
    public MyNode(Object val, MyNode nextN) {
        this.nextN = nextN;
        this.val = val;
    }

    /**
     * MyNode Constructor: Sets the next MyNode to MyNode nextN.
     * 
     * @param nextNode
     *            The next node in MyNode.
     */
    public MyNode(MyNode nextNode) {
        this.nextN = nextNode;
        val = null;
    }

    /**
     * Returns the value of the MyNode.
     * 
     * @return The value of the MyNode.
     */
    public Object getElement() {
        return val;
    }

    /**
     * Sets the current value of the MyNode to val.
     * 
     * @param value
     *            The value that will be assigned to the MyNode.
     * @return The current value of MyNode after the value was set.
     */
    public Object setElement(Object value) {
        this.val = value;
        return this.val;
    }

    /**
     * Returns the next link in MyNode.
     * 
     * @return The next MyNode.
     */
    public MyNode next() {
        return nextN;
    }

    /**
     * Set the next node in MyNode.
     * 
     * @param nextNode
     *            The next node in MyNode.
     * @return The next new node in MyNode.
     */
    public MyNode setNext(MyNode nextNode) {
        this.nextN = nextNode;
        return this.nextN;
    }
}

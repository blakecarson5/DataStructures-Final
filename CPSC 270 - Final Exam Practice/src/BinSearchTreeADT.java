/**
 * <!-- ASG3
 * 
 * <pre>
 * INSTRUCTIONS FOR READING THIS ASSIGNMENT:
 * 1. Create an Eclipse project for this assignment.
 * 2. Import this file into that project.
 * 3. In Eclipse, right-click the imported file and select Export/Java/JavaDoc
 * 4. Note the destination (look for this in the bottom 1/3 of the dialog box
 * 5. Click Finish
 * 6. Find the index.html file and double click it.
 * </pre>
 * 
 * -->
 * <h1>Asg3: Binary Search Tree</h1>
 * <h2>Objectives</h2>
 * <p>
 * <ul>
 * <li>develop/improve your ability to implement a BinSearchTreeADT given its
 * ADT</li>
 * <li>develop/improve your ability to write JUnit tests</li>
 * <li>develop/improve your ability to write readable code according to best
 * practices</li>
 * </ul>
 * </p>
 * <h2>Introduction</h2>
 * <p>
 * The BinSearchTreeADT defines the API for a Binary Search Tree. Note that a
 * newly created BinSearchTreeADT is empty.
 * </p>
 * <h3>Description</h3>
 * <p>
 * A BinSearchTreeADT is a Binary Search Tree of Character.
 * </p>
 * <h3>Fluent Programming Style</h3>
 * <p>
 * Note that there are no void methods here. Methods that would normally be void
 * return the this Object so that method calls can be chained. For example:
 * 
 * <pre>
 * Suppose SetADT foo = new SetImplementation();
 * Then foo.add("a").add("b"); produces the same result as
 * foo.add("a");
 * foo.add("b");
 * </pre>
 * </p>
 * <p>
 * Your task is to implement this ADT, develop a JUnit test class, and document
 * both using Javadoc. You will need to implement a Binary Search Tree Node as
 * shown in section 7.8.1 of the book. Use the same Class definition for leaves
 * and internal nodes.
 * </p>
 * <h2>Instructions</h2>
 * <p>
 * <ul>
 * <li>Study the code in Chapter 7, especially 7.11 of-the textbook.</li>
 * <li>Your implementation should store Characters.</li>
 * <li>Your implementation should NOT use generics.</li>
 * <li>Write the Javadoc for the JUnit class and the implementation.</li>
 * <li>Write the JUnit tests for the ADT described by this API.</li>
 * <li>Implement, using pointers, NOT ARRAYS, the ADT described by this
 * API.</li>
 * <li>You may NOT use any pre-existing classes that defeat the purposes of this
 * assignment (ex. List, ArrayList, etc.)</li>
 * <li>Submit your files to Web-CAT using the eclipse menu "Project->Submit
 * Assignment..."</li>
 * <li>To see my comments after I've graded your work, or to see your results at
 * any time, login to http://web-cat.cs.vt.edu</li>
 * </ul>
 * </p>
 * <h2>Practical Tips</h2>
 * <p>
 * Develop preliminary JUnit tests before you implement the methods, using the
 * process described in class and the slides. For example, develop tests for a
 * method, implement the method, run the tests. Do this until the method passes
 * the tests. Go on to the next method.
 * </p>
 * <p>
 * Sometimes you may have to implement a little bit as well in order to write
 * your JUnit tests. The process involves switching between JUnit tests and
 * implementation, in order to develop a good understanding of the problems to
 * be solved.
 * </p>
 * </p>
 * <h2>NOTES</h2>
 * <p>
 * <li>Any submission that does not use pointers as described in the book and in
 * class will receive NO CREDIT.</li>
 * <li>Any submission that that uses pre-existing classes like ArrayList will
 * receive NO CREDIT.</li>
 * <li>You may submit as many times as you like until the deadline.</li>
 * <li>The grade of your latest submission will be the one recorded.</li>
 * </ul>
 * </p>
 * <h2>CHECKLISTS</h2>
 * <p>
 * Check that you have done all the following.
 * <table border="1">
 * <tr>
 * <td>DONE?</td>
 * <td>TASK</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>The implementing class for this assignment is named BinSearchTreeImp</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>All methods specified in the ADT are implemented</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Except for constructors, any non-ADT methods are declared PRIVATE</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Fields, if any, are declared private</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Code is formatted as described in piazza</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Javadoc is present in the implementation and JUnit class headers as well
 * as all non-private fields and ALL methods, as described in piazza</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Class header javadoc must include a brief description of the class, and
 * the &#64;author and &#64;version tags</td>
 * </tr>
 * </table>
 * </p>
 * <p>
 * Here is a table of some common things I look for when reviewing your code:
 * <a href=
 * "https://piazza-resources.s3.amazonaws.com/j6cf19dpqik109/j7qk5asq32652g/codingcomments20170918.pdf?AWSAccessKeyId=AKIAIEDNRLJ4AZKBW6HA&Expires=1505848559&Signature=lGyzsnCmvrE1r6I%2BGTkCLfoZw70%3D">
 * Coding Comments Table</a>
 * </p>
 * <p>
 * Check that you read and followed these how-to items in piazza.
 * </p>
 * <table border="1">
 * <tr>
 * <td>DONE?</td>
 * <td>TASK</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: how to write JUnit tests</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: how to write readable code (and satisfy Web-CAT's format
 * checks)</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: setup Eclipse for Web-CAT</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Watch: video: setup eclipse to format your code for Web-CAT</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: submit your assignment to Web-CAT from within Eclipse</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Video: find formatting or code coverage errors in my source code</td>
 * </tr>
 * </table>
 *
 * @author acsiochi
 * @version 20171113 Initial version
 */
public interface BinSearchTreeADT {

    /**
     * <p>
     * Add the given Character into this Binary Search Tree. The resulting tree
     * must still be a Binary Search Tree.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * 
     * <h3>Example</h3>
     * 
     * <pre>
     * if BinSearchTreeADT t is
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * then t.add('c') produces
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * </pre>
     * 
     * @param c
     *            item to add
     * @return address of this BinSearchTreeADT
     */
    public BinSearchTreeADT add(Character c);

    /**
     * <p>
     * Count the number of nodes in this BinSearchTreeADT whose values are less
     * than the given Character. This must be done using the tree itself. No
     * credit will be given if this is not done. For example, it is NOT allowed
     * to get a traversal of the tree and examine that string, counting
     * characters that are less than the given character.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * if BinSearchTreeADT t is
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * 
     * then t.countOf('f') produces
     * 4
     * </pre>
     * 
     * @param c
     *            the Character used to determine whether a node is counted
     * @return the number of nodes with values less than o
     */
    public Integer countOf(Character c);

    /**
     * <p>
     * Determine the height of this tree. The height of a tree is the length of
     * the longest path from the root to a leaf. The height of an empty tree is
     * 0.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * if BinSearchTreeADT t is
     *      d
     *    /   \
     *   b     f
     *  / \      
     * a   c      
     * 
     * then t.height() produces
     * 3
     * </pre>
     * 
     * @return the height of this tree
     */
    public Integer height();

    /**
     * <p>
     * Make the binary search tree shown below.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * Given the declaration BinSearchTreeADT t, if t.mkFull() is called then
     * t is
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * </pre>
     * 
     * @return the address of t
     */
    public BinSearchTreeADT mkFull();

    /**
     * <p>
     * Return a string that is the preorder traversal of this BinSearchTreeADT.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * if BinSearchTreeADT t is
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * 
     * then t.preorder() produces
     * dbafeg
     * </pre>
     * 
     * @return the preorder traversal of this BinSearchTreeADT
     */
    public String preorder();

    /**
     * <p>
     * Remove the given Character from this BinSearchTreeADT. If it is not
     * possible to remove the given Character, this method should fail silently
     * and make no changes to the tree.
     * </p>
     * <h3>THIS MUST BE DONE RECURSIVELY</h3>
     * <p>
     * No credit will be awarded for non-recursive solutions.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * if BinSearchTreeADT t is
     *      d
     *    /   \
     *   b     f
     *  / \   / \
     * a   c e   g
     * 
     * then t.remove('c') produces
     *      d
     *    /   \
     *   b     f
     *  /     / \
     * a     e   g
     * </pre>
     * 
     * @param c
     *            the Character to remove
     * @return the address of this BinSearchTreeADT
     */
    public BinSearchTreeADT remove(Character c);

    /**
     * toString should return the preorder() of this tree.
     * 
     * @return the preorder() of this tree
     */
    public String toString();

}
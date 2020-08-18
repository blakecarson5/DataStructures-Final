import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test of the LispADT ADT using LinkedLisp implementation.
 * 
 * @author Blake Carson
 * @version 20171009 bac all methods of LinkedLisp.java are tested
 */
public class LinkedLispTest {

    /**
     * doesLinkedLispConstructorCallDefault. --- Checks to see if the default
     * LinkedLisp() constructor is called when the LinkedLisp(Integer size)
     * constructor is called.
     */
    @Test
    public void doesLinkedLispConstructorCallDefault() {
        LinkedLisp list = new LinkedLisp(5);
        Integer ansSize = new Integer(0);
        assertEquals(ansSize, list.size());
    }

    /**
     * doesLinkedLispMoveNext. --- Checks to make sure the next() method moves
     * the cursor to the right when not at the end of the list.
     */
    @Test
    public void doesLinkedLispMoveNext() {
        LinkedLisp list = new LinkedLisp();
        list.add('q');
        list.next();
        assertEquals("< q | >", list.toString());
    }

    /**
     * doesLinkedLispMoveNextWhenAtEnd. --- Checks to make sure the next()
     * method does not move the cursor to the right when already at the end.
     */
    @Test
    public void doesLinkedLispMoveNextWhenAtEnd() {
        LinkedLisp list = new LinkedLisp();
        list.add('r');
        list.next().next();
        assertEquals("< r | >", list.toString());
    }

    /**
     * doesLinkedLispMovePrev. --- Checks to make sure the prev() method moves
     * the cursor to the left when not at the beginning of the list.
     */
    @Test
    public void doesLinkedLispMovePrev() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.next();
        list.add('t');
        list.next();
        list.prev();
        assertEquals("< x | t >", list.toString());
    }

    /**
     * doesLinkedLispMovePrevWhenAtBeginning. --- Checks to make sure the prev()
     * method does not move the cursor to the left when at the beginning of the
     * list.
     */
    @Test
    public void doesLinkedLispMovePrevWhenAtBeginning() {
        LinkedLisp list = new LinkedLisp();
        list.add('y');
        list.next();
        list.add('r');
        list.next();
        list.prev().prev().prev();
        assertEquals("< | y , r >", list.toString());
    }

    /**
     * doesLinkedLispAddWhenEmpty. --- Checks if the add() method correctly
     * inserts the object when the list is empty.
     */
    @Test
    public void doesLinkedLispAddWhenEmpty() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        assertEquals("< | x >", list.toString());
    }

    /**
     * doesLinkedLispAddAtEnd. --- Checks if the add() method correctly inserts
     * the object when the cursor is at the end of the list.
     */
    @Test
    public void doesLinkedLispAddAtEnd() {
        LinkedLisp list = new LinkedLisp();
        list.add('a');
        list.next();
        list.add('c');
        assertEquals("< a | c >", list.toString());
    }

    /**
     * doesLinkedLispCurrNotMoveWhenAdding. --- Makes sure the cursor does not
     * move when the add() method is called.
     */
    @Test
    public void doesLinkedLispCurrNotMoveWhenAdding() {
        LinkedLisp list = new LinkedLisp();
        list.add('b');
        list.add('d');
        assertEquals("< | d , b >", list.toString());
    }

    /**
     * doesLinkedLispAddWhenCurrEqualsTail. --- Checks if the add() method
     * correctly inserts the object when the cursor is to the right of the last
     * element of the list.
     */
    @Test
    public void doesLinkedLispAddWhenCurrEqualsTail() {
        LinkedLisp list = new LinkedLisp();
        list.add('a');
        list.add('b');
        list.next().next();
        list.add('c');
        assertEquals("< b , a | c >", list.toString());
    }

    /**
     * isLinkedLispSizeZeroWhenEmpty. --- Checks if the size is 0 when the list
     * is empty.
     */
    @Test
    public void isLinkedLispSizeZeroWhenEmpty() {
        LinkedLisp list = new LinkedLisp();
        int size = list.size();
        assertEquals(0, size);
    }

    /**
     * doesLinkedLispSizeIncrementWhenAdding. --- Makes sure the size value
     * increases by 1 when the an object is added to the list.
     */
    @Test
    public void doesLinkedLispSizeIncrementWhenAdding() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.add('r');
        list.add('u');
        int size = list.size();
        assertEquals(3, size);
    }

    /**
     * doesLinkedLispSizeDecrementWhenRemoving. --- Makes sure the size value
     * decreases by 1 when an object is removed.
     */
    @Test
    public void doesLinkedLispSizeDecrementWhenRemoving() {
        LinkedLisp list = new LinkedLisp();
        list.add('t');
        list.add('z');
        list.add('e');
        list.remove();
        int size = list.size();
        assertEquals(2, size);
    }

    /**
     * doesLinkedLispSizeDecrementWhenSizeIsZero. --- Makes sure the size value
     * does not decrement below 0 when the list is empty.
     */
    @Test
    public void doesLinkedLispSizeDecrementWhenSizeIsZero() {
        LinkedLisp list = new LinkedLisp();
        list.remove();
        int size = list.size();
        assertEquals(0, size);
    }

    /**
     * doesLinkedLispRemoveCurrent. --- Checks if the remove() method correctly
     * removes the current object in the list.
     */
    @Test
    public void doesLinkedLispRemoveCurrent() {
        LinkedLisp list = new LinkedLisp();
        list.add('y');
        list.add('z');
        list.add('w');
        list.remove();
        assertEquals("< | z , y >", list.toString());
    }

    /**
     * doesLinkedLispRemoveCurrentEqualsTail. --- Makes sure nothing is removed
     * when the remove() method is called and the cursor is to the right of the
     * last element of the list.
     */
    @Test
    public void doesLinkedLispRemoveCurrentEqualsTail() {
        LinkedLisp list = new LinkedLisp();
        list.add('u');
        list.add('v');
        list.add('s');
        list.next().next().next();
        list.remove();
        assertEquals("< s , v , u | >", list.toString());
    }

    /**
     * doesLinkedLispRemoveCurrentEqualsMiddle. --- Checks if the remove()
     * method correctly removes an element between two other elements of the
     * list.
     */
    @Test
    public void doesLinkedLispRemoveCurrentEqualsMiddle() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.add('y');
        list.add('z');
        list.next();
        list.remove();
        assertEquals("< z | x >", list.toString());
    }

    /**
     * doesLinkedLispRemoveCurrentEqualsLast. --- Checks if the remove() method
     * correctly removes the last element of the list.
     */
    @Test
    public void doesLinkedLispRemoveCurrentEqualsLast() {
        LinkedLisp list = new LinkedLisp();
        list.add('e');
        list.add('f');
        list.add('g');
        list.next().next();
        list.remove();
        assertEquals("< g , f | >", list.toString());
    }

    /**
     * doesLinkedLispGetCurrent. --- Checks if the get() method correctly
     * returns the current element of the list.
     */
    @Test
    public void doesLinkedLispGetCurrent() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.add('y');
        assertEquals('y', list.get());
    }

    /**
     * doesLinkedLispGetCurrentIsLast. --- Checks if the get() method correctly
     * returns the last element of the list.
     */
    @Test
    public void doesLinkedLispGetCurrentIsLast() {
        LinkedLisp list = new LinkedLisp();
        list.add('q');
        list.add('r');
        list.add('s');
        list.next().next();
        assertEquals('q', list.get());
    }

    /**
     * doesLinkedLispThrowExceptionWhenGetCurrentIsTail. --- Checks if the get()
     * method throws a RuntimeException when current points to tail.
     */
    @Test(expected = RuntimeException.class)
    public void doesLinkedLispThrowExceptionWhenGetCurrentIsTail()
            throws RuntimeException {
        LinkedLisp list = new LinkedLisp();
        list.get();
        assertEquals(null, list.get());
    }

    /**
     * doesLinkedLispCurrPositionEqualZeroWhenEmpty. --- Checks if curPos()
     * returns 0 when the list is empty.
     */
    @Test
    public void doesLinkedLispCurrPositionEqualZeroWhenEmpty() {
        LinkedLisp list = new LinkedLisp();
        Integer x = new Integer(0);
        assertEquals(x, list.curPos());
    }

    /**
     * isLinkedLispCurrPositionCorrectWhenCurrIsTail. --- Checks if curPos()
     * correctly returns the position of the cursor when to the right of the
     * last element.
     */
    @Test
    public void isLinkedLispCurrPositionCorrectWhenCurrIsTail() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.add('r');
        list.add('u');
        list.next().next().next();
        Integer x = new Integer(3);
        assertEquals(x, list.curPos());
    }

    /**
     * isLinkedLispCurrPositionCorrectWhenCurrIsLast. --- Checks if curPos()
     * correctly returns the position of the cursor when to the left of the last
     * element.
     */
    @Test
    public void isLinkedLispCurrPositionCorrectWhenCurrIsLast() {
        LinkedLisp list = new LinkedLisp();
        list.add('t');
        list.add('r');
        list.add('k');
        list.next().next();
        Integer x = new Integer(2);
        assertEquals(x, list.curPos());
    }

    /**
     * isLinkedLispCurrPositionCorrectWhenCurrIsMiddle. --- Checks if curPos()
     * correctly returns the position of the cursor when the position is towards
     * the middle of the list.
     */
    @Test
    public void isLinkedLispCurrPositionCorrectWhenCurrIsInMiddle() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.add('y');
        list.add('z');
        list.next();
        Integer x = new Integer(1);
        assertEquals(x, list.curPos());
    }

    /**
     * doesLinkedLispEqualFalseWhenObjIsNull. --- Checks the Object == null case
     * when the equals() method is called, must return false.
     */
    @Test
    public void doesLinkedLispEqualFalseWhenObjIsNull() {
        LinkedLisp list = new LinkedLisp();
        LinkedLisp l = null;
        assertFalse(list.equals(l));
    }

    /**
     * doesLinkedLispEqualFalseWhenObjIsNotLinkedLisp. --- Checks if the Object
     * is not an instance of a LinkedLisp when the equals() method is called,
     * must return false.
     */
    @Test
    public void doesLinkedLispEqualFalseWhenObjIsNotLinkedLisp() {
        LinkedLisp list = new LinkedLisp();
        Integer l = 1;
        assertFalse(list.equals(l));
    }

    /**
     * doesLinkedLispEqualFalseWhenToStringIsNotTheSame. --- Checks if equals()
     * returns false when the Object's toString() does not match
     * this.toString().
     */
    @Test
    public void doesLinkedLispEqualFalseWhenToStringIsNotTheSame() {
        LinkedLisp list = new LinkedLisp();
        list.add('x');
        list.add('y');
        list.add('z');
        LinkedLisp l = new LinkedLisp();
        l.add('a');
        l.add('b');
        l.add('c');
        assertFalse(list.equals(l));
    }

    /**
     * doesLinkedLispEqualFalseWhenToStringIsTheSame. --- Checks if equals()
     * returns true when the Object's toString() matches this.toString().
     */
    @Test
    public void doesLinkedLispEqualTrueWhenToStringIsTheSame() {
        LinkedLisp list = new LinkedLisp();
        list.add('m');
        list.add('n');
        list.add('o');
        LinkedLisp l = new LinkedLisp();
        l.add('m');
        l.add('n');
        l.add('o');
        assertTrue(list.equals(l));
    }

    /**
     * doesLinkedLispMoveToZero. --- Checks to make sure the the moveTo() method
     * moves current to the correct position, in this case zero.
     */
    @Test
    public void doesLinkedLispMoveToZero() {
        LinkedLisp list = new LinkedLisp();
        list.add('r');
        list.add('m');
        list.add('n');
        list.next().next();
        list.add('o');
        list.moveTo(0);
        assertEquals("< | n , m , o , r >", list.toString());
    }

    /**
     * doesLinkedLispMoveToLast. --- Checks to make sure the the moveTo() method
     * moves current to the correct position, in this case 4.
     */
    @Test
    public void doesLinkedLispMoveToLast() {
        LinkedLisp list = new LinkedLisp();
        list.add('r');
        list.add('m');
        list.add('n');
        list.next().next();
        list.add('o');
        list.moveTo(4);
        assertEquals("< n , m , o , r | >", list.toString());
    }

    /**
     * doesLinkedLispNotMoveWhenBelow0. --- Checks to make sure the the moveTo()
     * method does not move when parameter is out of bounds.
     */
    @Test
    public void doesLinkedLispNotMoveWhenBelow0() {
        LinkedLisp list = new LinkedLisp();
        list.add('r');
        list.add('m');
        list.add('n');
        list.next().next();
        list.add('o');
        list.moveTo(-1);
        assertEquals("< n , m | o , r >", list.toString());
    }

    /**
     * doesLinkedLispNotMoveWhenAboveSize. --- Checks to make sure the the
     * moveTo() method does not move when parameter is out of bounds.
     */
    @Test
    public void doesLinkedLispNotMoveWhenAboveSize() {
        LinkedLisp list = new LinkedLisp();
        list.add('r');
        list.add('m');
        list.add('n');
        list.next().next();
        list.add('o');
        list.moveTo(5);
        assertEquals("< n , m | o , r >", list.toString());
    }
}

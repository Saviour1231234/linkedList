import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void testAddToLinkedList() {
        var linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(4);
        assertEquals(6, linkedList.length());
    }

    @Test
    void testNewLinkedList() {
        var linkedList = new MyLinkedList<Integer>();
        assertTrue(linkedList.isEmpty());       // linked list should be empty
        assertEquals(0, linkedList.length());

        linkedList.add(2);
        assertFalse(linkedList.isEmpty());     // linked list should not be empty
        assertEquals(1, linkedList.length());
    }

    @Test
    void testRemoveInLinkedList(){
        var linkedList = new MyLinkedList<String>();
        linkedList.add("Clevertec");
        linkedList.add("2022");
        linkedList.add("!");
        assertEquals(3, linkedList.length());
        linkedList.remove(2);
        assertEquals(2, linkedList.length());
    }

    @Test
    void testUpdateLinkedList() {
        var linkedList = new MyLinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(4);
        linkedList.update(3, 1000);

        int number = linkedList.get(3);

        assertEquals(number, 1000);

    }


}
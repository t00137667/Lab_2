import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void addFirst() {
    }

    @Test
    void getFirst() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> myList = new CP3LinkedList<>();
        boolean actual = myList.isEmpty();
        boolean expected = true;

        assertEquals(expected, actual);

        myList.addFirst("Ryan");
        myList.addFirst("Ian");

        actual = myList.isEmpty();
        expected = false;

        assertEquals(expected, actual);

    }

    @Test
    void print() {
    }

    //@Test
    //void testExpectedException() {

    //    Assertions.assertThrows(NumberFormatException.class, () -> {
    //        Integer.parseInt("One");
    //    });

    //}

}
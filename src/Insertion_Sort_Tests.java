import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class Insertion_Sort_Tests {
    Insertion_Sort sort = new Insertion_Sort();

    @Test
    void testEmptyListReturnsEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        assertEquals(emptyList, sort.performInsertionSort(emptyList));
    }

}

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class Insertion_Sort_Tests {
    Insertion_Sort sort = new Insertion_Sort();

    @Test
    void testEmptyListReturnsEmptyList() {
        ArrayList<Character> emptyList = new ArrayList<Character>();
        assertEquals(emptyList, sort.performInsertionSort(emptyList));
    }
    
    @Test
    void testListOfLengthOneReturnsSameList() {
        ArrayList<Character> listOfOne = new ArrayList<Character>();
        listOfOne.add('A');
        assertEquals(listOfOne, sort.performInsertionSort(listOfOne));
    }
    
    @Test
    void testListOfTwoReturnsSortedList() {
        ArrayList<Character> listOfTwo = new ArrayList<Character>();
        listOfTwo.add('B');
        listOfTwo.add('A');
        
        ArrayList<Character> expected = new ArrayList<Character>();
        expected.add('A');
        expected.add('B');
        
        ArrayList<Character> actual = sort.performInsertionSort(listOfTwo);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSortExample() {
        ArrayList<Character> exampleList = new ArrayList<Character>();
        exampleList.add('E');
        exampleList.add('X');
        exampleList.add('A');
        exampleList.add('M');
        exampleList.add('P');
        exampleList.add('L');
        exampleList.add('E');
        
        
        
        ArrayList<Character> expected = new ArrayList<Character>();
        expected.add('A');
        expected.add('E');
        expected.add('E');
        expected.add('L');
        expected.add('M');
        expected.add('P');
        expected.add('X');
        
        
        ArrayList<Character> actual = sort.performInsertionSort(exampleList);
        assertEquals(expected, actual);
    }

}

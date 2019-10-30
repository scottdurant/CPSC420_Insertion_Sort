import java.util.ArrayList;

public class Insertion_Sort {

    
    
    ////////////////// USE DEVELOP BRANCH //////////////////////////////////////
    
    
    
    
    
    /**
     * @todo: print out the list at each iteration
     * Accepst an arraylist and returns it sorted using insertion sort.
     * Follows the psuedo code from class
     */
    public ArrayList<Character> performInsertionSort(ArrayList<Character> list){
        int n = list.size();
        System.out.println("Original List:" + list);
        System.out.println("Size = " + n);
        
        for (int i = 1; i < n; i++) {
            Character v = list.get(i);
            int j = i - 1;
            while ((j >= 0) && (list.get(j).compareTo(v) > 0)) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, v);
            System.out.println("List after iteration " + i + ": " + list);
        }
        return list;
    }
}

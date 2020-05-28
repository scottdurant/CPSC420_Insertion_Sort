import java.util.ArrayList;
import java.util.Scanner;

public class Insertion_Sort { 
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter characters to sort, no spaces: ");
        String userInput = scnr.nextLine();
        scnr.close();
        
        ArrayList<Character> listToSort = new ArrayList<Character>();
        
        // put the input into an ArrayList
        for (int i=0; i<userInput.length(); i++) {
            listToSort.add(userInput.charAt(i));
        }
        
        System.out.println("Sorting list: " + listToSort + " with insertion sort...");
        ArrayList<Character> sortedList = performInsertionSort(listToSort);
        System.out.println("Done");
    }
    
    
    
    
    /**
     * Accepts an arraylist and returns the arraylist sorted using insertion sort.
     * Based on the psuedo code from class
     */
    public static ArrayList<Character> performInsertionSort(ArrayList<Character> list){
        int n = list.size();
        
        // index starts at 1 because index 0 is considered sorted
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

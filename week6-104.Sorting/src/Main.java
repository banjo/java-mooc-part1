
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // indexes:   0  1  2  3  4
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    int smallest = array[index];
    int startIndex = index;

    for (int i = index; i < array.length; i++){
        if (array[i] < smallest){
            smallest = array[i];
            startIndex = i;
        }
    }
    
    return startIndex;
    
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
    int swap1 = array[index1];
    array[index1] = array[index2];
    array[index2] = swap1;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i < array.length; i++){
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, indexSmallest, i);
            System.out.println(Arrays.toString(array));
        }
        
    }
  
    
    

}

import java.util.*;

public class ReverseArray {

    
    public static <T> void printReverseArray(T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
       
        Integer[] intArray = {16, 26, 345, 41,10};


        Double[] doubleArray = {16.1, 25.2, 36.3, 42.4, 95.5};

  
        Character[] charArray = {'i', 'k', 'l', 'r', 'm'};

        
        System.out.println("Reversed integer array:");
        printReverseArray(intArray);

        System.out.println("Reversed double array:");
        printReverseArray(doubleArray);

        System.out.println("Reversed character array:");
        printReverseArray(charArray);
    }
}

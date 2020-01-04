package javaplay;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Arrays();
        System.out.println("Hello World!");
    }


    // Array List Review
    public static void ArrList() {
        List<String> listofStrings = new ArrayList<>();
    }

    // arrays review  
    public static void Arrays() {

        // create the array with a certain size which is fixed for life of the array
        // create the array with a certian set of init values. the size of this set
        // determines the size of the array -- it's exacly large enough to hold all
        // of those values, its size is fixed for the life of the array.

        /// new elementType arraySize;

        // creates an empty array of 5 elements:
        Integer[] integers = new Integer[5];
        // System.out.println(integers);
        displayArray(integers);

        Integer[] integers2 = new Integer[] {1,2,3,4,5};

        displayArray(integers2);

        Integer[] integers3 = {1,2,3,4,5};
        
        displayArray(integers3);

        /////////////////Another Wayy to Init arrays\\\\\\\\\\\\\\\\

        int[] arrayInt = new int[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i+1;            
        }

    }

    public static void primitiveCounterparts(){
        //Every primitive type in the java lan has a jdk couterpart class

        /*
        Primitive	    JDK counterpart
        boolean	        java.lang.Boolean
        byte	        java.lang.Byte
        char	        java.lang.Character
        short	        java.lang.Short
        int	            java.lang.Integer
        long	        java.lang.Long
        float	        java.lang.Float
        double	        java.lang.Double

        Each JDK class provides methods to parse and 
        convert from its internal representation to a 
        corresponding primitive type. For example, 
        this code converts the decimal value 238 to an Integer:
        */


        int value = 238;
        Integer boxedValue = Integer.valueOf(value);
    }


    public static<T> void displayArray(T[] array) {
        System.out.println("");
        System.out.print("[");
        for (T element : array) {
            System.out.print(" ");
            System.out.print(element);
        }
        System.out.print(" ]");
        System.out.println("");

    }
}

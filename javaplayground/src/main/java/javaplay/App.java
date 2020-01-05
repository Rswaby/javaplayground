package javaplay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Arrays();
        ArrList();
        setOfStuff();
        System.out.println("Hello World!");
    }
    //Maps

    public static void MapPractice() {

        Map<String, Integer> mapOfIntegers = new HashMap<>();
        mapOfIntegers.put("1", Integer.valueOf(1));
        mapOfIntegers.put("2", Integer.valueOf(2));
        mapOfIntegers.put("3", Integer.valueOf(3));
        //...
        mapOfIntegers.put("168", Integer.valueOf(168));


        Set<String> keys = mapOfIntegers.keySet();
        Logger l = Logger.getLogger("Test");
        for (String key : keys) {
        Integer  value = mapOfIntegers.get(key);
        l.info("Value keyed by '" + key + "' is '" + value + "'");
}
        
        
    }

    //sets
    public static void setOfStuff() {
        
        Set<Integer> setOfIntegers = new HashSet();
        setOfIntegers.add(Integer.valueOf(10));
        setOfIntegers.add(Integer.valueOf(20));
        setOfIntegers.add(Integer.valueOf(30));
        setOfIntegers.add(Integer.valueOf(40));
        setOfIntegers.add(Integer.valueOf(50));
        Logger l = Logger.getLogger("Test");
        for (Integer i : setOfIntegers) {
        l.info("Integer value is : " + i);
        }
        
    }



    // Array List Review
    public static void ArrList() {
        //List is an interface so we canit instantiate it directly
        List<String> listofStrings = new ArrayList<>();
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        List<Person> listOfPersons = new ArrayList<Person>();

        listOfPersons.add(new Person());
        listOfIntegers.add(Integer.valueOf(90));
        listofStrings.add("Another String");

        //add() method adds the element to the end of the list
        
        //List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(Integer.valueOf(238));
        Logger l = Logger.getLogger("Test");
        l.info("Size of listOfIntegers "+listOfIntegers.size());
        l.info("Item at index 0 is: " + listOfIntegers.get(0));




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

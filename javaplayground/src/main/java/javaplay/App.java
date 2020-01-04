package javaplay;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Arrays();
        System.out.println("Hello World!");
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

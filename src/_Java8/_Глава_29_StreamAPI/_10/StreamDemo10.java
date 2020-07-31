package _Java8._Глава_29_StreamAPI._10;
// Demonstrate trySplit().
import java.util.*;
import java.util.stream.*;
class StreamDemo10 {
    public static void main (String[] args) {
        // Create a list of Strings.
        ArrayList <String> myList = new ArrayList <>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
        // Obtain a Stream to the array list.
        Stream <String> myStream = myList.stream();
        // Obtain a Spliterator.
        Spliterator <String> splitItr = myStream.spliterator();
        // Now, split the first iterator.
        Spliterator <String> splitItr2 = splitItr.trySplit();
        // If splitItr could be split, use splitItr2 first.
        if (splitItr2 != null) {
            System.out.println("Output from splitItr2: ");
            splitItr2.forEachRemaining(System.out :: println);
        }
        // Now, use the splitItr.
        System.out.println("\nOutput from splitItr: ");
        splitItr.forEachRemaining(System.out :: println);
    }
}


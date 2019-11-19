package tim.fizzbuzz;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        int max = 300;

        for (int i = 1; i <= max; i++) {
            LinkedList<String> toPrint = new LinkedList<>();

            // divisible by 3?
            if (i % 3 == 0)
                toPrint.add("Fizz");

            // divisible by 5?
            if (i % 5 == 0)
                toPrint.add("Buzz");

            // divisible by 7?
            if (i % 7 == 0)
                toPrint.add("Bang");

            // divisible by 11?
            if (i % 11 == 0) {
                toPrint.clear();
                toPrint.add("Bong");  // overwrite
            }

            // divisible by 13?
            if (i % 13 == 0) {
                // iterate through to find the first one starting with "B"
                // (is there not a helper function for this?)
                for (int j = 0; j < toPrint.size(); j++) {
                    if (toPrint.get(j).matches("^B")) {
                        // insert our new element just before this
                        toPrint.add(j, "Fezz");
                        break;  // out of the for loop, so we don't add too many
                    }
                }

                // if we haven't added it yet, add it at the end
                if (!toPrint.contains("Fezz"))
                    toPrint.add("Fezz");
            }

            // divisible by 17?
            if (i % 17 == 0) {
                // reverse the list
                LinkedList<String> newList = new LinkedList<String>();
                Iterator<String> it = toPrint.descendingIterator();
                while(it.hasNext())
                    newList.add(it.next());
                toPrint = newList;
            }

            // none?
            if (toPrint.size() == 0)
                toPrint.add(String.valueOf(i));

            // then print
            for (String item : toPrint)
                System.out.print(item);
            System.out.println();
        }
    }
}

package tim.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String toPrint = "";

            // divisible by 3?
            if (i % 3 == 0)
                toPrint += "Fizz";

            // divisible by 5?
            if (i % 5 == 0)
                toPrint += "Buzz";

            // divisible by 7?
            if (i % 7 == 0)
                toPrint += "Bang";

            // divisible by 11?
            if (i % 11 == 0)
                toPrint = "Bong";  // overwrite

            // divisible by 13?
            if (i % 13 == 0) {
                // if contains a "B", put before that
                if (toPrint.matches("B"))
                    toPrint = toPrint.replaceFirst("B", "FezzB");
                // if not, put at end
                else
                    toPrint = toPrint.replaceFirst("$", "Fezz");  // will fill empty string too
            }

            // neither?
            if (toPrint.equals(""))
                toPrint = String.valueOf(i);

            // then print
            System.out.println(toPrint);
        }
    }
}

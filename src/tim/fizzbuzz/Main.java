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

            // neither?
            if (toPrint.equals(""))
                toPrint = String.valueOf(i);

            // then print
            System.out.println(toPrint);
        }
    }
}

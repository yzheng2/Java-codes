import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public Integer value = 0;

    /**
     * Inner class to assist in reading integers from streams
     */
    private class IntegerReader {

        BufferedReader reader;
        private String buffer;
        public Integer value;

        public IntegerReader(InputStream s) {
            reader = new BufferedReader(new InputStreamReader(s));
        }

        /**
         * Read next integer and store its value in outer class
         * 
         * @throws EOFException
         */
        public void readNextInt() throws EOFException {
            try {
                buffer = reader.readLine();
                if (buffer == null || !Character.isDigit(buffer.charAt(0)))
                    throw new EOFException();
                value = Integer.parseInt(buffer);
            } catch (EOFException e) {
                throw e;
            } catch (NumberFormatException | IOException e) {
                value = null;
            } finally {
                // catch remaining exceptions
                value = 0;
            }
        }
    }

    /**
     * Read stdin until EOF and increment all integers by 1
     * 
     * @throws EOFException
     */
    public void readInts() throws EOFException {
        final IntegerReader integerReader = new IntegerReader(System.in);

        while (true) {
            integerReader.readNextInt();
            System.out.format("%d\n", integerReader.value + 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        try {
            solution.readInts();
        } catch (EOFException e) {
            // no action
        }
    }
}
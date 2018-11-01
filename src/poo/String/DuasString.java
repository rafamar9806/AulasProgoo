import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DuasString {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        boolean igual = false;

        if (s1 != null && s2 != null) {

            for (int i = 0; i < s1.length() - 1; i++) {
                for (int e = 0; e < s2.length() - 1; e++) {
                    if (s1.charAt(i) == (s2.charAt(e))) {
                        igual = true;
                    } else {
                        igual = false;
                    }
                }
            }
        }

        if (igual) {
            return "YES";
        } else {
            return "NO";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
      int min_deletions=0;
      int[] a_frequencies= new int[26];
      int[] b_frequencies= new int[26];

      for(int i=0;i<a.length();i++)
      {
        char curr_char=a.charAt(i);
        int char_to_int= (int) curr_char;
        int position= char_to_int-(int)'a';
        a_frequencies[position]++;
        
       }
       for(int i=0;i<b.length();i++)
      {
        char curr_char=b.charAt(i);
        int char_to_int= (int) curr_char;
        int position= char_to_int-(int)'a';
        b_frequencies[position]++;
        
       }
       for(int i=0;i<26;i++)
       {
         int difference= Math.abs(a_frequencies[i]-b_frequencies[i]);
         min_deletions+=difference;
       }

      return min_deletions;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

// KthString.java: Takes a command-line argument k and prints 
// the kth string from the end found on standard input, 
// assuming that standard input has k or more strings.

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class KthString {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Queue<String> queue = new Queue<String>();
        String[] words = StdIn.readAll().split(" ");
        int J = words.length - N;
        StdOut.println(words[J]);
        
    }
}

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
    // Return true if s has matching parentheses, and false otherwise.
    private static boolean match(String s) {
        Stack<Character> stack;
        stack = new Stack<Character>();
        String ch = "()[]{}";
        char[] g = ch.toCharArray();
        
        for (int b = 0; b < s.length(); b++) {
            char n = s.charAt(b);
            char i = ';';
            if (!stack.isEmpty()) { i = stack.peek(); }
             if (i == g[0] && n == g[1]) {
                stack.pop();
            }
            else if (i == g[2] && n == g[3]) {
                stack.pop();
            }
            else if (i == g[4] && n == g[5]) {
                stack.pop();
            }
            else stack.push(n);
        }
        if (stack.isEmpty()) {
            return true;
                
        } return false;
            
    }
    

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        StdOut.println(match(StdIn.readAll().trim()));
    }
}

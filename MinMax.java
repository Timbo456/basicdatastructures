


import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class MinMax {
    // Linked list class.
    private static class Node {
        private int item;
        private Node next;
    }

    // Return the minimum value in the given linked list.
    public static int min(Node first) {
        int m = first.item;
        Node current = first.next;
        while (current.next != null) {
            if (current.item < m) {
                m = current.item;
            }
                current = current.next;
       }
       return m;
    }
    

    // Return the maximum value in the given linked list.
    public static int max(Node first) {
        int a = first.item;
        Node current = first.next;
        while (current.next != null) {
            if (current.item > a) {
                a = current.item; 
            }
            current = current.next;
        }
        return a;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        int[] items = new int[1000];
        for (int i = 0; i < 1000; i++) {
            items[i] = StdRandom.uniform(-10000, 10000);
        }
        Node first = null; 
        for (int item : items) {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
        }
        StdOut.println(min(first) == StdStats.min(items) 
                       && max(first) == StdStats.max(items));
    }
}
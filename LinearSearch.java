import java.util.*;
import java.io.*;

public class LinearSearch {
    public static void main (String[] args) {
        FastScanner scanner = new FastScanner();
        System.out.println("Enter number of elements :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element to look for :");
        int key = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean keyFound = false;
        for(int i = 0; i < n; i++) {
            if (arr[i] == key) {
                keyFound = true;
                System.out.println("Key element " + key + "found at index " + i);
                break;
            }
        }
        if (!keyFound) System.out.println(key + " is not present in the array");
    }
}

// Template for Fast Scanner in Java

class FastScanner {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
    public FastScanner() {
        reader = new BufferedReader(new InputStreamReader(System.in), 32768);
        tokenizer = null;
    }
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
    public int nextInt() {
        return Integer.parseInt(next());
    }
    public long nextLong() {
        return Long.parseLong(next());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public String nextLine() {
        try {
            return reader.readLine();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}


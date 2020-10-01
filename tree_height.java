
import java.util.*;
import java.io.*;

public class tree_height {
    class FastScanner {

		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public class TreeHeight {

		int n;
		int parent[];
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
			}
		}

		
		int computeHeight() {
			int[] heights = new int[n];
			int treeHeight = 0;
			for (int i = 0; i < n; i++) {
				heights[i] = indexHeight(parent, heights, i);
				treeHeight = Math.max(treeHeight, heights[i]);
			}
			return treeHeight;
		}
		int indexHeight(int[] p, int[] h_arr, int node) {
			if (p[node] == -1) {
				return 1;
			}
			if (h_arr[node] != 0) {
				return h_arr[node];
			}
			h_arr[node] = 1 + indexHeight(p, h_arr, p[node]);
			return h_arr[node];
		}
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_height().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}

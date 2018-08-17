import java.io.PrintWriter;

public class Main1 {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		PrintWriter out = new PrintWriter(System.out);
		if(N%K == 0)out.println(0);
		else out.println(1);
		out.flush();
	}
}


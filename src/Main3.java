import java.io.PrintWriter;

public class Main3 {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		if(N==0){
			out.println(0);
			out.flush();
			return;
		}
		while(N!=0){
			if(Math.abs(N%2) ==1){
				sb.append(1);
				N -= 1;
			}
			else sb.append(0);
			N /= -2;
		}
		out.println(sb.reverse().toString());
		out.flush();
	}

}


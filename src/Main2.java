import java.io.PrintWriter;

public class Main2 {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		PrintWriter out = new PrintWriter(System.out);
		String result = "No";
		for(int i=0;i<15;i++){
			for(int j=0;j<=25;j++){
				if(7*i+4*j==N){
					result = "Yes";
					break;
				}
			}
		}
		out.println(result);
		out.flush();
	}
}
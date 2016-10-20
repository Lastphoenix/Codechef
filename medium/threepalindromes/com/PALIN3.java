package threepalindromes.com;

import static java.util.Arrays.*;
import java.io.*;
import java.text.*;
 
class PALIN3 {
 
	public PALIN3 () {
		char [] C = sc.nextChars();
		int [][] L = manacher(C);
 
		int N = C.length;
		int [] W = new int [N];
		for (int i : rep(N))
			W[i] = C[i] - '0';
 
		long [] S = new long [N+1];
		for (int i : rep(N))
			S[i+1] = mod(S[i] + W[i]);
 
		int [][] Q = new int [3][N+1];
		for (int i : rep(3))
			for (int j : rep(N))
				Q[i][j+1] = Q[i][j] + (W[j] != 0 && S[j+1] == i ? 1 : 0);
 
		long res = 0;
		for (int i : rep(N)) {
			int s = (int)S[i+1], r = (int)mod(s + W[i]);
			res += Q[s][i+ L[0][i]/2 +1] - Q[s][i+1];
			res += Q[r][i+ L[1][i]/2 +1] - Q[r][i+1];
			if (mod(W[i]) == 0)
				++res;
		}
 
		print(res);
	}
 
	private static int [][] manacher(char [] C) {
		int N = C.length, M = 2*N+1;
		char [] D = new char [M]; fill(D, '$');
		for (int i = 0; i < N; ++i)
			D[2*i+1] = C[i];
 
		int [] L = new int [M];
		int c = 0, r = 0; // Here the first element in D has been processed.
		int m = 0, n = 0; // The walking indices to compare if two elements are the same
 
		for (int i = 1; i < M; i++) {
			if (i > r) {
				L[i] = 0; m = i-1; n = i+1;
			} else {
				int j = 2*c - i;
				if (L[j] < (r-i)) {
					L[i] = L[j];
					m = -1; // This signals bypassing the while loop below.
				} else {
					L[i] = r-i;
					n = r+1; m = 2*i - n;
				}
			}
			while (m >= 0 && n < M && D[m] == D[n]) {
				++L[i]; --m; ++n;
			}
			if ((i + L[i]) > r) {
				c = i; r = i + L[i];
			}
		}
 
		int [][] res = new int [2][N];
		for (int i = 0; i < N; ++ i) {
			res[0][i] = L[2*i+2];
			res[1][i] = L[2*i+1];
		}
 
		return res;
	}
 
	private static final int MOD = 3;
	private static long mod(long x) { return mod(x, MOD); }
	private static long mod(long x, long mod) { return ((x % mod) + mod) % mod; }
	private static int [] rep(int N) { return rep(0, N); }
	private static int [] rep(int S, int T) { if (T <= S) return new int [0]; int [] res = new int [T-S]; for (int i = S; i < T; ++i) res[i-S] = i; return res; }
	////////////////////////////////////////////////////////////////////////////////////
	private static final IOUtils.MyScanner sc = new IOUtils.MyScanner();
	private static void print (Object o, Object ...a) { IOUtils.print(o, a); }
	private static class IOUtils {
		private static class MyScanner {
			public char [] nextChars() {
				readToken();
				int c = 0;
				char [] res = new char[T[1] - T[0]];
				for (int i = T[0]; i < T[1]; ++i)
					res[c++] = (char)b[i];
				return res;
			}
			//////////////////////////////////////////////
			private final static int MAX_SZ = (int)1e7;
			private final byte [] b = new byte[MAX_SZ];
			private final int [] T = new int [2];
			private int cur = 0;
			private MyScanner () {
				try {
					InputStream is = new BufferedInputStream(System.in);
					while (is.available() == 0)
						Thread.sleep(1);
					start();
					int off = 0, c;
					while ((c = is.read(b, off, MAX_SZ - off)) != -1)
						off += c;
				} catch (Exception e) {
					throw new Error(e);
				}
			}
			private void readToken() {
				int c;
				for (c = cur; b[c] != SPACE && b[c] != LF && b[c] != CR && b[c] != 0; ++c);
				T[0] = cur; T[1] = c;
				for (cur = c; b[cur] == SPACE || b[cur] == LF || b[cur] == CR; ++cur);
			}
			private static final char LF = '\n';
			private static final char CR = '\r';
			private static final char SPACE = ' ';
		}
		private static String build(Object o, Object... a) { return buildDelim(" ", o, a); }
		private static String buildDelim(String delim, Object o, Object... a) {
			StringBuilder b = new StringBuilder();
			append(b, o, delim);
			for (Object p : a)
				append(b, p, delim);
			return b.substring(delim.length());
		}
		//////////////////////////////////////////////////////////////////////////////////
		private static void start() { if (t == 0) t = millis(); }
		private static void append(StringBuilder b, Object o, String delim) {
			if (o.getClass().isArray()) {
				int len = java.lang.reflect.Array.getLength(o);
				for (int i = 0; i < len; ++i)
					append(b, java.lang.reflect.Array.get(o, i), delim);
			} else if (o instanceof Iterable<?>)
				for (Object p : (Iterable<?>) o)
					append(b, p, delim);
			else {
				if (o instanceof Double)
					o = new DecimalFormat("#.############").format(o);
				b.append(delim).append(o);
			}
		}
		private static java.io.PrintWriter pw = new java.io.PrintWriter(System.out);
		private static void print(Object o, Object ...a) { pw.println(build(o, a)); }
		private static void err(Object o, Object ...a) { System.err.println(build(o, a)); }
		private static void exit() {
			IOUtils.pw.close();
			System.out.flush();
			err("------------------");
			err(IOUtils.time());
			System.exit(0);
		}
		private static long t;
		private static long millis() { return System.currentTimeMillis(); }
		private static String time() { return "Time: " + (millis() - t) / 1000.0; }
		private static void run(int N) {
			for (int n = 1; n <= N; ++n)
				new PALIN3();
			exit();
		}
	}
	public static void main(String[] args) throws IOException {
		int N = 1; //sc.nextInt();
		IOUtils.run(N);
	}
}
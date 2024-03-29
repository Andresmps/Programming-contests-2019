/**
 * 
 */
package theChristmasTree;

import java.io.*;
import java.util.*;

/**
 * @author Andres Martinez
 *
 */
public class TheChristmasTree {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer sc;
	
	public static void main(String[] args) throws IOException{

		int N, h, d, g;
		
		N = Integer.valueOf(bf.readLine());
		
		for(int i = 0; i < N; ++i) {
			sc = new StringTokenizer(bf.readLine());
			h = Integer.valueOf(sc.nextToken());
			d = Integer.valueOf(sc.nextToken());
			g = Integer.valueOf(sc.nextToken());
			
			pw.println((h >= 200 && h <= 300 && d >= 50 && g >= 150) ? "Sim" : "Nao");
			
		}
		pw.close();
		
	}

}



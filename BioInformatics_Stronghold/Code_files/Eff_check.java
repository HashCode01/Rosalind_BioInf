package string_matching;

import java.io.*;

public class Eff_check {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException 
	{
		// declaring objects 
		KMP kmp = new KMP();
		Naive naive = new Naive();
		// RK rk = new RK();
		
		// declaring variables
		double exec_time;
		long start,end;
		String txt,pat;
		String data_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\BioInf\\src\\string_matching\\";
		FileReader fr = new FileReader(data_path+"Vibrio_cholerae.txt");
		BufferedReader br = new BufferedReader(fr);
		txt = br.readLine();
		// pat = br.readLine();
		txt = "CGGACTCGACAGATGTGAAGAACGACAATGTGAAGACTCGACACGACAGAGTGAAGAGAAGAGGAAACATTGTAA";
		pat = "CGACA";
		// About Input
		System.out.println("\n\n\nText : " + txt);
		System.out.println("Pattern : " + pat + "\n");
		System.out.println("Length of Text : "+ txt.length());
		System.out.println("Length of Pattern : "+ pat.length()+"\n\n");
		
		//Time calculation for Naive algorithm
		System.out.println("Results for Naive Algorithm : \n");
		// Time calculation for naive
		start = System.nanoTime();
		naive.main(txt,pat);
		end = System.nanoTime();
		exec_time = (end-start)/1000000.0;
		System.out.println("Time taken : " + exec_time + " ms");
		
		System.out.println("\n\nResults for KMP Algorithm : \n");
		
		// Time calculation for Knuth-Morris-Pratt
		start = System.nanoTime();
		kmp.main(txt,pat);
		end = System.nanoTime();
		exec_time = (end-start)/1000000.0;
		System.out.println("Time taken : " + exec_time + " ms");
		
//		System.out.println("\n\nResults for RK Algorithm : \n");
//		// Time calculation for robin-karp
//		start = System.nanoTime();
//		rk.main(txt,pat);
//		end = System.nanoTime();
//		exec_time = (end-start)/1000.0;
//		System.out.println("Time taken : " + exec_time + " ms");
		br.close();
		fr.close();
	}

}

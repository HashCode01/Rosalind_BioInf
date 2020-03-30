package problems;

import java.io.*;

public class Wabbits{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_fib.txt");
		BufferedReader br = new BufferedReader(fr);
		int n = Integer.parseInt(br.readLine().trim());
		int k = Integer.parseInt(br.readLine().trim());
		FileWriter fw = new FileWriter(path+"wabbits_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		long res;
		res = Fib(n,0,1,k);
		System.out.println(res);
		bw.write(res+" ");
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

	private static long Fib(int n, long i, long j,int k) {
		// TODO Auto-generated method stub
		if(n == 0)
			return i;
		if(n == 1)
			return j;
		else 
			return Fib(n-1,j,k*i+j,k);
	}
}


package problems;

import java.io.*;

public class Mortal_rabbits{

	static long Fibv[] = new long[101];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_fibd.txt");
		BufferedReader br = new BufferedReader(fr);
		int n = Integer.parseInt(br.readLine().trim());
		int k = Integer.parseInt(br.readLine().trim());
		FileWriter fw = new FileWriter(path+"m_rabbits_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		long res;
		Fibv[0] = Fibv[1] = Fibv[2] = 1;
		res = Fib(n,k);
		System.out.println(res);
		bw.write(res+" ");
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
	private static long Fib(int n, int k) {
		// TODO Auto-generated method stub
		if(Fibv[n] == 0)
		{
			if(n-k-1 >= 0)
				Fibv[n] = Fib(n-1,k) + Fib(n-2,k) - Fib(n-k-1,k);
			else
				Fibv[n] = Fib(n-1,k) + Fib(n-2,k);
		}
		return Fibv[n];
	}
}

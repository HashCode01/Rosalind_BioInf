package problems;

import java.io.*;

public class rev_comp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String in_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\inputs\\";
		String out_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\outputs\\";
		FileReader fr = new FileReader(in_path+"dataset_3_2.txt"); //rosalind_revc
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		//txt = "TTGTGTC";
		FileWriter fw = new FileWriter(out_path+"rev_comp_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println(txt);
		int k = txt.length();
		String res = "";
		for(int i=k-1;i>=0;i--)
		{
			char x = txt.charAt(i);
			if(x == 'A')
				res += 'T';
			else if(x == 'T')
				res += 'A';
			else if(x == 'C')
				res += 'G';
			else
				res += 'C';
		}
		System.out.println(res);
		bw.write(res);
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}

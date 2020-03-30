package problems;

import java.io.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class RNA_pro{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String in_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\inputs\\";
		String out_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\outputs\\";
		FileReader fr = new FileReader(in_path+"rosalind_prot.txt");
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		FileWriter fw = new FileWriter(out_path+"RNA_Pro_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String res;
		res = Conv(txt);
		System.out.println(res);
		bw.write(res+" ");
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

	@SuppressWarnings("unchecked")
	private static String Conv(String txt) {
		// TODO Auto-generated method stub
		String res = "";
		@SuppressWarnings("rawtypes")
		Dictionary table = new Hashtable();
		String conList[][] = {{"UUU","F"},{"CUU","L"},{"AUU","I"},{"GUU","V"},
							  {"UUC","F"},{"CUC","L"},{"AUC","I"},{"GUC","V"},
							  {"UUA","L"},{"CUA","L"},{"AUA","I"},{"GUA","V"},
							  {"UUG","L"},{"CUG","L"},{"AUG","M"},{"GUG","V"},
							  {"UCU","S"},{"CCU","P"},{"ACU","T"},{"GCU","A"},
							  {"UCC","S"},{"CCC","P"},{"ACC","T"},{"GCC","A"},
							  {"UCA","S"},{"CCA","P"},{"ACA","T"},{"GCA","A"},
							  {"UCG","S"},{"CCG","P"},{"ACG","T"},{"GCG","A"},
							  {"UAU","Y"},{"CAU","H"},{"AAU","N"},{"GAU","D"},
							  {"UAC","Y"},{"CAC","H"},{"AAC","N"},{"GAC","D"},
							  {"UGU","C"},{"CGU","R"},{"AGU","S"},{"GGU","G"},
							  {"UGC","C"},{"CGC","R"},{"AGC","S"},{"GGC","G"},
							  {"UGG","W"},{"CGG","R"},{"AGG","R"},{"GGG","G"},
							  {"UAA","Stop"},{"CAA","Q"},{"AAA","K"},{"GAA","E"},
							  {"UAG","Stop"},{"CAG","Q"},{"AAG","K"},{"GAG","E"},
							  {"UGA","Stop"},{"CGA","R"},{"AGA","R"},{"GGA","G"}};
		for(String[] pro_item : conList)
		{
			table.put(pro_item[0],pro_item[1]);
		}
		int len = txt.length();
		int i = 0;
		while(i < len)
		{
			String prot = txt.substring(i,i+3);
			String x = (String)(table.get(prot));
			if(x == "Stop")
				break;
			else
				res += x;
			i+=3;
		}
		return res;
	}
}

 
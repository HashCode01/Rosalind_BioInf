package problems;

import java.io.*;
import java.util.ArrayList;

public class Motif_DNA{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Motif_DNA obj = new Motif_DNA();
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_subs.txt");
		BufferedReader br = new BufferedReader(fr);
		// String s,t;
		String s = br.readLine();
		String t = br.readLine();
//		s = "GATATATGCATATACTT";
//		t = "ATAT";
		FileWriter fw = new FileWriter(path+"motif_dna_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = obj.kmp_match(s, t);
		
		for(int i : result)
		{	
			bw.write((i+1)+" ");
		}
		System.out.println(result);
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
	
	public ArrayList<Integer> kmp_match(String txt, String pat)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int i = 0,j = 0,lenp = pat.length(),lent = txt.length();
		int sp[] = new int[lenp];
		sp[0] = 0;
		
		i = 1;
		//calculate distance
		while(i<lenp)
		{
			if(pat.charAt(i) == pat.charAt(j))
			{
				j++;
				sp[i] = j;
				i++;
			}
			else
			{
				if(j != 0)
					j = sp[j-1];
				else
				{
					sp[i] = j;
					i++;
				}
			}
		}
		
		i = 0;j = 0;
		//match string
		while(i<lent)
		{
			if(txt.charAt(i) == pat.charAt(j))
			{
				i++;
				j++;
			}
			if(j == lenp)
			{
				res.add(i-j);
				j = sp[j-1];
			}
			else if(i < lent && pat.charAt(j) != txt.charAt(i))
			{
				if(j != 0)
					j = sp[j-1];
				else
					i++;
			}
		}
		return res;
	}
}


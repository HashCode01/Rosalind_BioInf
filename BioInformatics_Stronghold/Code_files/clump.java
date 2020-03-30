package string_matching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class clump 
{
	public static void main(String [] args)throws IOException
	{
		String txt;
		String data_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\BioInf\\src\\string_matching\\";
		FileReader fr = new FileReader(data_path+"coli.txt");
		BufferedReader br = new BufferedReader(fr);
		txt = br.readLine();
		// txt = "CGGACTCGACAGATGTGAAGAACGACAATGTGAAGACTCGACACGACAGAGTGAAGAGAAGAGGAAACATTGTAA";
		// txt = txt.substring(0,51);
		int len = txt.length();
		System.out.println(len);
		String a[] = br.readLine().split(" ");
		int k = Integer.parseInt(a[0]);
		// int k = 5;
		int L = Integer.parseInt(a[1]);
		// int L = 50;
		int t = Integer.parseInt(a[2]);
		// int t = 4;
		System.out.println(k+" : "+L+" : "+t);
		int pt = 0;
		ArrayList<String> clump = new ArrayList<>();
		while(pt < len-L)
		{
			String si = txt.substring(pt,pt+L);
			ArrayList<String> res = new ArrayList<>();
			res = get_kmer(si,k,t);
			for(String s : res)
				if(!clump.contains(s))
					clump.add(s);
			pt++;
		}
		System.out.println(clump.size());
		System.out.println(clump);
		br.close();
		fr.close();
	}

	private static ArrayList<String> get_kmer(String txt, int k, int t) 
	{
		// TODO Auto-generated method stub
		KMP obj = new KMP();
		int len = txt.length();
		ArrayList<String> mfr = new ArrayList<String>();
		ArrayList<String> mfw = new ArrayList<String>();
		int i = 0;
		while(i < len-k)
		{
			String s = txt.substring(i,i+k);
			if(!mfr.contains(s))
			{
				mfr.add(s);
				int l = (obj.kmp_match(txt, s)).size();
				// System.out.println(s+ " : "+ l + " ; "+t);
				if(l >= t)
				{
					mfw.add(s);
				}
			}
			i++;
		}
		// System.out.println(mfw);
		return mfw;
	}
}

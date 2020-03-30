package string_matching;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
//import java.util.Dictionary;
//import java.util.Hashtable;
import java.util.TreeMap;

public class ComputingFrequencies
{
	public static void main(String [] args)throws IOException
	{
		String txt;
		String data_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\BioInf\\src\\string_matching\\";
		FileReader fr = new FileReader(data_path+"dataset_2994_5.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter(data_path+"out2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		txt = br.readLine();
		// txt = "ACGCGGCTCTGAAA";
		// txt = txt.substring(0,51);
		int len = txt.length();
		System.out.println(len);
		//String a[] = br.readLine().split(" ");
		int k = Integer.parseInt(br.readLine());
		// int k = 2;
		int lim = (int)Math.pow(4,k);
		System.out.println(k+" : "+lim);
		TreeMap<String,Integer> wordlist = new TreeMap<String,Integer>();
		for(int i=0;i<lim;i++)
		{
			wordlist.put(get_pat(i,k), 0);
		}
		// System.out.println(wordlist);
		System.out.println(wordlist.size());
		int i = 0;
		while(i <= len-k)
		{
			String s = txt.substring(i,i+k);
			int zz = wordlist.get(s);
			wordlist.replace(s,zz+1);
			i++;
		}
		// System.out.println(wordlist);
		for(Map.Entry<String,Integer> entry : wordlist.entrySet())
		{
			bw.write(entry.getValue()+ " ");
		}
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

	private static String get_pat(int i, int k) 
	{
		String res = "";
		while(i > 0)
		{
			String let = "";
			switch(i % 4)
			{
				case 0: let = "A";
						break;
				case 1: let = "C";
						break;
				case 2: let = "G";
						break;
				case 3: let = "T";
						break;
			}
			res = let + res;
			i /= 4;
		}
		int len = res.length();
		if(len < k)
		{
			while(len < k)
			{
				res = "A" + res;
				len++;
			}
			
		}
		// TODO Auto-generated method stub
		return res;
	}
}

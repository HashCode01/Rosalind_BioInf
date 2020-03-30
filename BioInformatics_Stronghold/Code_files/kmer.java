package string_matching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class kmer 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
		KMP obj = new KMP();
		String txt;
		int len;
		int maxl = 0;
		String data_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\BioInf\\src\\string_matching\\";
		FileReader fr = new FileReader(data_path+"dataset_2_10.txt");
		BufferedReader br = new BufferedReader(fr);
		txt = br.readLine();
		txt = "CGCCTAAATAGCCTCGCGGAGCCTTATGTCATACTCGTCCT";
		len = txt.length();
		int k = Integer.parseInt(br.readLine());
		k = 3;
		System.out.println(txt);
		System.out.println(k);
		ArrayList<String> mfw = new ArrayList<String>();
		ArrayList<String> mfr = new ArrayList<String>();
		int i = 0;
		while(i < len-k)
		{
			String s = txt.substring(i,i+k);
			if(!mfr.contains(s))
			{
				mfr.add(s);
				int l = (obj.kmp_match(txt, s)).size();
				// System.out.println(s+ " : "+ l);
				if(l > maxl)
				{
					maxl = l;
					mfw.clear();
					mfw.add(s);
				}
				else if (l == maxl)
				{
					mfw.add(s);
				}
			}
			i++;
		}
		System.out.println(mfw);
	}
}

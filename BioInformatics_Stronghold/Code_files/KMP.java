package string_matching;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class KMP 
{
	public static void main(String txt, String pat) throws IOException
	{
		KMP obj = new KMP();
		String out_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\BioInf\\src\\string_matching\\";
		FileWriter fw = new FileWriter(out_path+"out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = obj.kmp_match(txt, pat);
		System.out.println("Number of Occurences : " + result.size());
		System.out.println("Strings matched at start positions : " + result);
		for(int i : result)
		{
			bw.write(i+" ");
		}
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

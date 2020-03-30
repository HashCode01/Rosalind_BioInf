package string_matching;

import java.util.ArrayList;
import java.util.List;

public class Naive {

	public static void main(String txt, String pat)
	{
		Naive obj = new Naive();
		List<Integer> result = new ArrayList<Integer>();
		result = obj.naive_match(txt, pat);
		System.out.println("Number of Occurences : " + result.size());
		System.out.println("Strings matched at start positions : " + result);
	}

	public List<Integer> naive_match(String txt, String pat) 
	{
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<Integer>();
		int i,j,k;
		int lenp = pat.length();
		int lent = txt.length();
		k=0;
		j=0;
		while(k <= lent - lenp)
		{
			boolean flag = true;
			i = k; j = 0;
			while(flag && j<lenp)
			{
				if(pat.charAt(j) == txt.charAt(i))
				{
					i++;j++;
				}
				else
					flag = false;
			}
			if(flag)
				res.add(i-j);
			k++;
		}
		return res;
	}

}

package problems;

import java.io.*;

public class Count_Nucle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int res[] = new int[4];
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_dna.txt");
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		FileWriter fw = new FileWriter(path+"DNA_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		res = count_DNA(txt);
		System.out.println(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
		bw.write(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

	private static int[] count_DNA(String txt) {
		// TODO Auto-generated method stub
		int res[] = new int[4];
		long k = txt.length();
		for(int i=0;i<k;i++)
		{
			if(txt.charAt(i) == 'A')
				res[0]++;
			else if(txt.charAt(i) == 'C')
				res[1]++;
			else if(txt.charAt(i) == 'G')
				res[2]++;
			else
				res[3]++;	
		}
		return res;
	}

}

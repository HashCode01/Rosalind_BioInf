package problems;

import java.io.*;

public class consensus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_cons.txt");
		BufferedReader br = new BufferedReader(fr);
		String res = "";
		char type[] = {'A','C','G','T'};
		float max = -999.0f;
		FileWriter fw = new FileWriter(path+"con_out.txt");
		int prof[][] = new int[type.length][1000];
		BufferedWriter bw = new BufferedWriter(fw);
		int m = -1;
		int n = 0;
		while(true)
		{
			String name = br.readLine();
			if(name == null)
				break;
			String txt = br.readLine();
			m++;
			System.out.println(name);
			System.out.println(txt);
			int k = txt.length();
			m = k;
			for(int i=0;i<k;i++)
			{
				max = -999;
				for(int j=0;j<4;j++)
				{
					if(txt.charAt(i) == type[j])
					{
						prof[j][i]++;
					}
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			max = -999;
			for(int j=0;j<4;j++)
			{
					if (max < prof[j][i])
					{
						max = prof[j][i];
						n = j;
					}
			}
			res += type[n];
		}
		System.out.println("\n    " + res + "\n");
		bw.write(res + "\n");
		for(int i=0;i<4;i++)
		{
			System.out.print(type[i]+" : ");
			bw.write(type[i]+": ");
			for(int j=0;j<m;j++)
			{
				System.out.print(prof[i][j]+" ");
				bw.write(prof[i][j]+" ");
			}
			System.out.println();
			bw.write("\n");
		}
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}

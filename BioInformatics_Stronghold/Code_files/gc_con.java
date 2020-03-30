package problems;

import java.io.*;

public class gc_con {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_gc.txt");
		BufferedReader br = new BufferedReader(fr);
		String res = "";
		float max = -999.0f;
		FileWriter fw = new FileWriter(path+"gc_con_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		while(true)
		{
			String name = br.readLine();
			if(name == null)
				break;
			String txt = br.readLine();
			System.out.println(txt);
			int k = txt.length();
			int ct = 0;
			for(int i=k-1;i>=0;i--)
			{
				char x = txt.charAt(i);
				if(x == 'C' || x == 'G')
					ct++;
			}
			float v = ((float)ct)/k;
			v *= 100.0;
			if(v > max)
			{
				max = v;
				res = name;
			}
		}
		System.out.println(res + "\n" + max);
		bw.write(res + "\n" + max);
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}

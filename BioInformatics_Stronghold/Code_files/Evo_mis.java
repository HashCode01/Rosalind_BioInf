package problems;
import java.io.*;

public class Evo_mis{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_hamm.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		String t = br.readLine();
		FileWriter fw = new FileWriter(path+"evo_mis_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int k = s.length();
		int hamm = 0;
		for(int i=0;i<k;i++)
		{
			if(s.charAt(i) != t.charAt(i))
				hamm++;
		}
		System.out.println(hamm);
		bw.write(hamm+" ");
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}


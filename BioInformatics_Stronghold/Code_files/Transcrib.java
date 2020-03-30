package problems;

import java.io.*;

public class Transcrib {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\";
		FileReader fr = new FileReader(path+"rosalind_rna.txt");
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		FileWriter fw = new FileWriter(path+"transcrib_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		txt = txt.replaceAll("T", "U");
		System.out.println(txt);
		bw.write(txt);
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}


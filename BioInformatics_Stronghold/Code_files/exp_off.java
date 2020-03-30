package problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exp_off {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String in_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\inputs\\";
		String out_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\outputs\\";
		FileReader fr = new FileReader(in_path+"rosalind_iev.txt");
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		String arr[] = txt.split(" ");
		int val[] = new int[6];
		int i = 0;
		for (String s : arr)
			val[i++] = Integer.parseInt(s);
		FileWriter fw = new FileWriter(out_path+"exp_off_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		double res = 0.0;
		float mult[] = {1.0f,1.0f,1.0f,0.75f,0.5f,0f};
		for(i=0; i< 6;i++)
		{
			res += 2*mult[i]*val[i];
		}
		System.out.println(res);
		bw.write(Double.toString(res));
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

}

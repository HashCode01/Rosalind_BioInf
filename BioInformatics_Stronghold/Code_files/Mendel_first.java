package problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mendel_first {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String in_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\inputs\\";
		String out_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\outputs\\";
		FileReader fr = new FileReader(in_path+"rosalind_iprb.txt");
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		String arr[] = txt.split(" ");
		int k = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int n = Integer.parseInt(arr[2]);
		FileWriter fw = new FileWriter(out_path+"mendel_first.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int total = k+m+n;
		double res;
		double mm = m/(double)total * (m-1)/(double)(total-1);
		double nn = n/(double)total * (n-1)/(double)(total-1);
		double mn = 2*(m/(double)total * (n)/(double)(total -1));
		res = 1 - (0.25*mm + 0.5*mn + nn);
		res = Math.round(res*100000)/100000.0;
		System.out.println(res);
		bw.write(Double.toString(res));
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

}

package problems;

import java.io.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class pro_mass{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String in_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\inputs\\";
		String out_path = "D:\\RODATA\\SelfDev\\files\\Java\\Eclipse\\Workspace\\Rosalind\\src\\problems\\outputs\\";
		FileReader fr = new FileReader(in_path+"rosalind_prtm.txt");
		BufferedReader br = new BufferedReader(fr);
		String txt = br.readLine();
		FileWriter fw = new FileWriter(out_path+"Pro_mass_out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		double res;
		res = Math.round(Calc(txt)*1000)/1000.0;
		System.out.println(res);
		bw.write(Double.toString(res));
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

	@SuppressWarnings("unchecked")
	private static double Calc(String txt) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Dictionary table = new Hashtable();
		table.put("A",71.03711);
		table.put("C",103.00919);
		table.put("D",115.02694);
		table.put("E",129.04259);
		table.put("F",147.06841);
		table.put("G",57.02146);
		table.put("H",137.05891);
		table.put("I",113.08406);
		table.put("K",128.09496);
		table.put("L",113.08406);
		table.put("M",131.04049);
		table.put("N",114.04293);
		table.put("P",97.05276);
		table.put("Q",128.05858);
		table.put("R",156.10111);
		table.put("S",87.03203);
		table.put("T",101.04768);
		table.put("V",99.06841);
		table.put("W",186.07931);
		table.put("Y",163.06333);
		int len = txt.length();
		double mass = 0.0;
		int i = 0;
		while(i < len)
		{
			String prot = txt.substring(i,i+1);
			double x = (double)(table.get(prot));
			mass += x;
			i++;
		}
		return mass;
	}
}
 
import java.util.*;
import java.io.*;

public class Rounder {
  
	double[] rlist;
	int size=0;
	
	public static void main(String[] args) throws Exception{
		Rounder ans = new Rounder(args[0]);
	}
	
	public Rounder(String filename) throws Exception {
		Scanner measure = new Scanner(new File(filename));

		while(measure.hasNextDouble()) {
			double line = measure.nextDouble();
			size++;
			//System.out.println(size);
		}

		double[] rlist = new double[size];
		//System.out.println(rlist);
		Scanner raw = new Scanner(new File(filename));
		for(int e=0; e<rlist.length;e++) {
			double x = Math.floor(raw.nextDouble());
			rlist[e] = x;
			//rlist[e] = raw.nextDouble();
			System.out.println(rlist[e]);
		}


	}

	public double[] getRound() {
		for(int e=0; e < rlist.length; e++) {
			System.out.println(rlist[e]);
		}
		System.out.println(size);
		return rlist;
	}
}
package com.practice.hackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);
    }
	
	public static void plusMinus(List<Integer> arr) {
		int l=arr.size(),z=0,p=0,n=0;
		for(int i:arr) {
			if(i==0)z++;
			else if(i>0)p++;
			else n++;
		}
		System.out.println(String.format("%.6f", (double)p/l));
		System.out.println(String.format("%.6f", (double)n/l));
		System.out.println(String.format("%.6f", (double)z/l));

    }

}

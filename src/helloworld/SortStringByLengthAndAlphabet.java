package helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class SortStringByLengthAndAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list;
		list = new ArrayList<String>();
		String temp;
		for(;scan.hasNextLine();) {
			temp = scan.nextLine();
			if(temp.equals("exit;")) {
				break;
			}
			list.add(temp);
			}
		sortStringByLengthAndAlpha(list);
		for(String s : list) {
			System.out.println(s);
		}
	}
	public static ArrayList<String> sortStringByLengthAndAlpha(ArrayList<String> start) {
		for(int i = 0; i != start.size(); i++) {
			String temp = start.remove(i);
			int j = 0;
			for(; j != i; j++) {
				if(firstBiggerCompareStringByLengthAndAlpha(start.get(j), temp)) {
					break;
				}
			}
			start.add(j, temp);
		}
		return start;
	}
	public static boolean firstBiggerCompareStringByLengthAndAlpha(String first, String second) {
		if(first.length() > second.length() || 
				(first.length() == second.length() && first.compareTo(second) > 0)) {
			return true;
		}
		return false;
	}
}

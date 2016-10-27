package helloworld;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(add(1, 2, 3, 4, 5));
	/////////////////////////////////////////////
/*		Integer a = new Integer(10), b = new Integer(10);
		String sa = new String("haha"), sb = new String("haha");
		System.out.println(a == b);
		b = Integer.parseInt("fff", 36);
		System.out.println(b);
		Boolean ba = new Boolean("true");
		ba = Boolean.parseBoolean("");
		String name = new String("Alice");
		int age = 14;
		float weight = 36.6f;
		System.out.format("The student named %s aged %d's weight is %.2f kg", name, age, weight);
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list;
		list = new ArrayList<String>();
		String temp;
		for(;scan.hasNextLine();) {
			temp = scan.nextLine();
			list.add(temp);
			}
		sortStringByLengthAndAlpha(list);
		for(String s : list) {
			System.out.println(s);
		}
		
		int[] listInt = new int[11];
		for(int i = 0; i != 1000000; i++) {
			int temp = (int)(Math.random() * 10);
			listInt[temp]++;
		}
		for(int i = 0; i != 11; i++) {
			//System.out.print(i + ": " + listInt[i] + ",");
			//listInt[i] += listInt[i - 1];
			System.out.println(i + ": " + listInt[i]);
		}*/
	/////////////////////////////////////////////
/*		OUT:		
		for(int i = 0; i != 5; i++) {
			for(int j = 10; j != 19; j++) {
				System.out.println(i + "/" + j);
				if(j == 15) {
					break OUT;
				}
			}
		}
	
		String[] flist;
		flist = new String[10];
		String[] flist2 = {"1.1f", "1.2f", "1.5f", "2.6f", "7.8f"};
		System.arraycopy(flist2, 0, flist, 1, flist2.length);
		swap(flist);
		for(String num : flist) {
			System.out.println(num);
		}
		
		int[] myIntArr = {3, 10, -8, 9, 5, 100, -200, -35};		
		Arrays.sort(myIntArr);
		for(int i : myIntArr) {
			System.out.print(i + "\tis\t");
			int index = Arrays.binarySearch(myIntArr, i);
			System.out.println(index);
		}
		
		int[][] marks;
		marks = new int[10][4];
		for(int i = 0; i != marks.length; i++) {
			marks[i] = new int[10];
		}
		System.out.println(marks[0][9]);
		
		ArrayList<Integer> listString;
		listString = new ArrayList<Integer>();
		listString.add(0, 2);
		listString.add(0, 1);
		listString.add(0, 1);
		listString.remove(0);
		listString.ensureCapacity(10);
		listString.trimToSize();
		for(Object i : listString) {
			System.out.println(i);
		}*/
	}
	public static int swap(String[] arr) {
		try {
			String temp = arr[0];
			try {
				arr[0] = arr[1];
				arr[1] = temp;
				return 1;
			} catch(Exception e) {
				return -2;
			}
		} catch(Exception e) {
			return -1;
		}
	}
	public static ArrayList<String> sortStringByLengthAndAlpha(ArrayList<String> start) {
		for(int i = 0; i != start.size(); i++) {
			String temp = start.remove(i);
			int j = 0;
			for(; j != i; j++) {
				if(start.get(j).length() > temp.length() || 
						(start.get(j).length() == temp.length() && start.get(j).compareTo(temp) > 0)) {
					break;
				}
			}
			start.add(j, temp);
		}
		return start;
	}
	public static int add(int... arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}

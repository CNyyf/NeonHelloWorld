package tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CutBigText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String op = input.next();
		if(op.equals("line")) {
			String originFile = input.next();
			String newFile = input.next();
			int lineCount = input.nextInt();
			int times = input.nextInt();
			cutByLines(originFile, newFile, lineCount, times);
		}
		else if(op.equals("line.")) {
			String originFile = input.next();
			String newFile = input.next();
			String postfix = input.next();
			int lineCount = input.nextInt();
			int times = input.nextInt();
			cutByLines(originFile, newFile, postfix, lineCount, times);
		}
		input.close();
	}
	
	public static int cutByLines(String fileName, String newFileName, String postfix, int lineMax, int times) {
		try {
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			String temp;
			File fileOut;
			int lineCounter = lineMax;
			int fileCounter = times + 1;
			PrintWriter output = null;
			try {
				while((temp = input.readLine()) != null) {
					if(lineCounter == lineMax) {
						lineCounter = 0;
						if(output != null) {
							output.close();
						}
						fileCounter--;
						if(fileCounter == 0) {
							break;
						}
						String tempFileName = newFileName + (times - fileCounter) + postfix;
						fileOut = new File(tempFileName);
						if(fileOut.exists()){
							fileOut.delete();
						}
						fileOut.createNewFile();
						output = new PrintWriter(new BufferedWriter(new FileWriter(tempFileName)));
					}
					output.println(temp);
					lineCounter++;
				}
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
				return -2;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		}
		return 1;
	}
	public static int cutByLines(String fileName, String newFileName, String postfix, int lineMax) {
		return cutByLines(fileName, newFileName, postfix, lineMax, 1);
	}
	public static int cutByLines(String fileName, String newFileName, int lineMax, int times) {
		return cutByLines(fileName, newFileName, "", lineMax, times);
	}
	public static int cutByLines(String fileName, String newFileName, int lineMax) {
		return cutByLines(fileName, newFileName, "", lineMax);
	}	
}

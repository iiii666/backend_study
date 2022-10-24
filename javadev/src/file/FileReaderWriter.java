package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReaderWriter {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File printWriter1 = new File("src/file/printWriter1.txt");
		File printWriter2 = new File("src/file/printWriter2.txt");
		File printWriter3 = new File("src/file/printWriter3.txt");
		
		
		try(PrintWriter pw = new PrintWriter(printWriter1);){
			pw.println("PrintWriter 예제#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요!");
			pw.println("반갑습니다");
			pw.printf("%d",7).printf("%s %f", "감사", 3.7);
			
			
			
		}
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(printWriter2));){
			pw.println("PrintWriter 예제#2");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요!");
			pw.println("반갑습니다");
			pw.printf("%d",7).printf("%s %f", "감사", 3.7);
			
			
			
		}try(PrintWriter pw = new PrintWriter(new FileOutputStream(printWriter3));){
			pw.println("PrintWriter 예제#3");
			pw.println(13);
			pw.println(5.8);
			pw.print("안녕하세요!");
			pw.println("반갑습니다");
			pw.printf("%d",7).printf("%s %f", "감사", 3.7);
			
			
			
		}
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("PrintWriter 예제#4");
		pw.println(13);
		pw.println(5.8);
		pw.print("안녕하세요!");
		pw.println("반갑습니다");
		pw.printf("%d",7).printf("%s %f", "감사", 3.7);
		
	}
}

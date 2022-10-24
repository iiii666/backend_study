package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {
		File orgfile = new File("src/file/cat.jpg");
		File copyfile1 = new File("src/file/copy1.jpg");
		File copyfile2 = new File("src/file/copy2.jpg");
		
		
		long start, end , time1, time2;
		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile);
				OutputStream os = new FileOutputStream(copyfile1);){
			int data;
			while((data = is.read())!= -1) {
				os.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without bufferedxxxstream:  " +time1 );
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgfile);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copyfile2);
				BufferedOutputStream bos = new BufferedOutputStream(os);){
			int data;
			while((data = bis.read())!= -1) {
				bos.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();

		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("with bufferedxxxstream  "+ time2);
		System.out.println("ratio tof with and without  "+ time1/time2);
	}
}
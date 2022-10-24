package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStream {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File dataFile = new File("src/file/file1.data");
		try (OutputStream os = new FileOutputStream(dataFile);
				DataOutputStream dos = new DataOutputStream(os);){
				dos.write(35);
				dos.writeDouble(5.8);
				dos.writeChar('A');
				dos.writeUTF("안녕하세요");
				dos.flush();
		}
		try (InputStream is = new FileInputStream(dataFile);
				DataInputStream dis = new DataInputStream(is);){
				System.out.println(dis.readInt());
				System.out.println(dis.readDouble());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
		} 
	}
}

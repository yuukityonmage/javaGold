package bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDir);
		FileInputStream fis = new FileInputStream("sample.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("sample_bk.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		try(bis;bos){
			byte[] data = null;
			while ((data = bis.readNBytes(1024)).length != 0) {
				bos.write(data);
			}
			bos.flush();
		}
	}

}

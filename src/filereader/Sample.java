package filereader;

import java.io.FileReader;

public class Sample {

	public static void main(String[] args) throws Exception {
//		File file = new File("sample.txt");
//		if(file.exists() == false) {
//			file.createNewFile();
//		}
//		System.out.println(file.getAbsolutePath());
		FileReader reader = null;
		try {
			reader = new FileReader("sample.txt");
			int i = 0;
			
			while((i = reader.read()) != -1) {
				System.out.print(i);
				char c = (char)i;
				System.out.print(c);
			}
		}finally {
			if(reader != null) {
				reader.close();
			}
		}
	}

}

package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("output.txt",true);
		try(out){
			out.write("\n");
			out.write("Hello,Java");
		}
	}

}

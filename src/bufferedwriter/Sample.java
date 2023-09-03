package bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("output.txt",true);
		BufferedWriter writer = new BufferedWriter(out);
		try(writer){
			writer.newLine();
			writer.write("bufferring output");
			writer.flush();
		}
	}

}

package Practice.files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class DemoFile {
	
	public static void main(String[] args) {
		
		 String filepath1 = "C:\\test\\test2.txt";
		    File f1 = new File(filepath1);

		    WriteFile(f1);
		    ReadFile(f1);

		}

		public static void WriteFile(File f1) {

		    if (!f1.exists()) {

		        try {
		            f1.createNewFile();
		        } catch (IOException e1) {
		          
		            e1.printStackTrace();
		        }

		    }
		    BufferedWriter Bw;
		    try {
		        Bw = new BufferedWriter(new FileWriter(f1));
		        Bw.write("Hi");
		        Bw.newLine();
		        Bw.write("What are you doing?");
		        Bw.close();

		    } catch (IOException e1) {
		       
		        e1.printStackTrace();
		    }

		}

		public static void ReadFile(File f1) {
		    BufferedReader Br = null;
		    try {
		        Br = new BufferedReader(new FileReader(f1));
		    } catch (FileNotFoundException e1) {
		       
		        e1.printStackTrace();
		    }

		    String line = "";
		    try {
		        while ((line = Br.readLine()) != null) {

		            System.out.println(line);
		        }
		    } catch (IOException e1) {

		        e1.printStackTrace();
		    }

	}

}

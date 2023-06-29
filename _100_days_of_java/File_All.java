import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_All {

	public static void main(String[] args) throws IOException {
			File file = new File("Sample.txt");
			if(file.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File Existing");
			}
			
			
			FileWriter write = new FileWriter(file);
			write.write("I happy to announce that My 100 Days Of Java!:) ");
			
			
			try {
				Scanner reader = new Scanner(file);
				while(reader.hasNext()) {
					System.out.println(reader.nextLine());
				}
				reader.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			write.close();
	}
}

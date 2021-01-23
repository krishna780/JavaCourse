package IoOperations.com.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java8filesread {

	public static void main(String[] args) throws Exception {
         
		Path pathFile = Paths.get("text.txt");
		
		
//		 List list=Files.readAllLines(pathFile);
//		 System.out.println(list);
		 
		 
	 Files.lines(pathFile).filter(f->f.length()>4)
	 
	 .forEach(System.out::println);
		
	 
	 
	 
	}

}

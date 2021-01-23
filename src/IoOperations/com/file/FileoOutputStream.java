package IoOperations.com.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileoOutputStream {

	public static void main(String[] args) throws Exception {
      
		BufferedOutputStream boi= new BufferedOutputStream(new FileOutputStream("text.txt"));
		
         String str="welcome to java world";
          byte[] bytes=  str.getBytes();
		boi.write(bytes);
		boi.flush();
		boi.close();
		
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("text.txt"));
	  bis.read();
	
	  
	  
	  
	  
	}

}

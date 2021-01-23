package IoOperations.com.file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Java8writefileEx {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("fileWrite.txt");
		List<String> list = Arrays.asList("apple", "boy", "cat", "dog", "Elephant");
		Path write1 = Files.write(pathFileToWrite, list, Charset.forName("UTF-8"), StandardOpenOption.WRITE);
		System.out.println(write1.toUri().getPath());

		Files.lines(write1).forEach(System.out::println);

	}

}

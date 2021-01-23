package IoOperations.com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Java8fileex {

	public static void main(String[] args) throws Exception {
		Path currentDirectory = Paths.get(".");
		Files.walk(currentDirectory, 2).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> String.valueOf(path).contains(".java");
		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attribute) ->attribute.isDirectory();

		
		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);

	}

}

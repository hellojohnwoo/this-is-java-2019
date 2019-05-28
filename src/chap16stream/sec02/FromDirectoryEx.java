/*

package chap16stream.sec02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FromDirectoryEx {
    public static void main(String[] args) throws IOException {
        Path path = Path.get("C:/...");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p-> System.out.println(p.getFileName()));
    }

}

*/

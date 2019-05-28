package chap16stream.sec02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentEx {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/chap16stream/sec02/linedata.txt");
        Stream<String> stream;

        // Files.Lines() method
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        stream.close();
        System.out.println();


        // BufferedReader's lines() method
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        stream = bufferedReader.lines();

        stream.forEach(System.out::println);
        stream.close();
        System.out.println();

    }
}

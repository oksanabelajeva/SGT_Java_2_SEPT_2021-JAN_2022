package lessons.lesson21.fileReaderExample;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderExample {

    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/User/3BE3DA/SGT_Java_2_SEPT_2021-JAN_2022/src/lessons/lesson21");
        int count = path.getNameCount();
        System.out.println(count);

        while (path.iterator().hasNext()){
            System.out.println(path.iterator().next().getFileName());
        }
    }
}

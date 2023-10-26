package Ziggy;

import java.nio.file.Path;

public class File {
    public static void main(String[] args) {
        String location ="c://users//semicolon//Desktop";

        Path path = Path.of(location );

        System.out.println(path);
        System.out.println(path.isAbsolute());
        System.out.println(path.getFileSystem());


    }
}

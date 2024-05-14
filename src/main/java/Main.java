
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

// Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
public class Main {
    public static void main(String[] args) throws IOException {
        int[] array1 = {100};
        int[] array2 = {200};
        int[] array3 = {300};


//        try (FileWriter writer = new FileWriter("src/main/resources/test1.txt")) {
//            writer.write(Arrays.toString(array1));
//            writer.write(Arrays.toString(array2));
//            writer.write(Arrays.toString(array3));
//        }
        copyFile("src/main/resources", "src/main/reserveCopy");

    }
    /**
     *
     * @param source - путь, откуда копируем
     * @param target - путь, куда копируем
     * @throws IOException - выкидываем I/O ошибку в случае исключения
     */
    public static void copyFile(String source, String target) throws IOException {
        File src = new File(source);
        File dest = new File(target);
        try {
            FileUtils.copyDirectory(src, dest);
        } catch (IOException e) {
            System.err.format("I/O exception");
        }
    }
}


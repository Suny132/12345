package utils;

import java.io.*;
import java.nio.file.*;

public class FileUtils {

    // 读取文件内容
    public static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    // 写入文件内容
    public static void writeFile(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // 删除文件
    public static void deleteFile(String path) throws IOException {
        Files.deleteIfExists(Paths.get(path));
    }

    // 创建文件夹
    public static void createDirectory(String dirPath) throws IOException {
        Files.createDirectories(Paths.get(dirPath));
    }
}

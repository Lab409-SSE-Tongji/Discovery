package com.lab409.Utilities;

import org.apache.commons.codec.binary.Base64;

import java.io.*;

/**
 * @author ZhangTianren
 * @version v0.1 2017/6/16.
 */
public class FileCodingUtil {
    private static final String BASE_PATH = "C:\\Users\\Administrator\\Desktop\\files\\";

    public static void saveFileFromBytes(byte[] b, String fileName) {
        BufferedOutputStream stream = null;
        File file;
        try {
            file = new File(BASE_PATH + fileName);
            FileOutputStream fin = new FileOutputStream(file);
            stream = new BufferedOutputStream(fin);
            stream.write(b);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static String encodeFile(String fileName){
        BufferedInputStream stream;
        File file;
        String result = "";
        try {
            file = new File(BASE_PATH + fileName);
            byte[] bytes = new byte[(int) file.length()];
            FileInputStream fin = new FileInputStream(file);
            stream = new BufferedInputStream(fin);
            stream.read(bytes);
            result = Base64.encodeBase64String(bytes);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

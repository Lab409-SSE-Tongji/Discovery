package com.lab409.Utilities;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ZhangTianren
 * @version v0.1 2017/6/16.
 */
public class SaveFileUtil {
    public static File getFileFromBytes(byte[] b, String picPath) {
        BufferedOutputStream stream = null;
        File file = null;
        try {
            file = new File("C:\\Users\\Administrator\\Desktop\\files\\" + picPath);
            FileOutputStream fstream = new FileOutputStream(file);
            stream = new BufferedOutputStream(fstream);
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
        return file;
    }
}

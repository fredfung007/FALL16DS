package com.CS102.recitation1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Fred Fung on 9/6/2016.
 */
public class IoTestOut {

    public static void main(String[] args) {
        String directory = "D:\\temp\\";
        Streaming(directory);
        readLinesUsingFilesWithTryBlock(directory);
        readLinesUsingFilesWithTryBlock("D:\\some\\directory\\that\\does\\not\\exist\\");
    }

    private static void Streaming(String directory) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(directory + "input");
            out = new FileOutputStream(directory + "output");
            int c;
            while ((c = in.read()) != -1) {
                if (c != 105) {
                    out.write(c);
                }
            }
            in.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void readLinesUsingFilesWithTryBlock(String directory)  {
        Path path = Paths.get(directory, "input");
        try{
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

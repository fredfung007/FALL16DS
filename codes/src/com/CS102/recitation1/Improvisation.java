package com.CS102.recitation1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Fred Fung on 9/7/2016.
 */
public class Improvisation {
    public static void main(String[] args) {
        readFileOneByOne("D:\\temp\\");
    }

    private static void readFileOneByOne(String directory) {
        File file = new File(directory + "input");
        try {
            //1 fish 2 fish red fish blue fish.
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String temp = scanner.next();
                if(temp.matches("fish(\\.)*")){
                    printToFile(directory, "oyster");
                } else {
                    printToFile(directory, temp);
                }
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void printToFile(String directory, String data){
        try {
            FileWriter fw = new FileWriter(directory+"output", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter printWriter = new PrintWriter(bw);
//            File file = new File(directory+"output");
//            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(data + " ");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
package com.CS102.recitation1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Fred Fung on 9/6/2016.
 */
public class IoTestOut {

    public static void main(String[] args) {
        String directory = "D:\\temp\\";
        readFileOneByOne(directory);
//        complexReadFile(directory);
//        readFileOneByOne("D:\\some\\directory\\that\\does\\not\\exist\\");
//        printToFile(directory);
    }

    private static void readFileOneByOne(String directory){
        File file = new File(directory+"input");
        try {
            //1 fish 2 fish red fish blue fish.
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    private static void complexReadFile(String directory)  {
        File file = new File(directory+"input");
        try {
            //1 fish 2 fish red fish blue fish.
            Scanner scanner = new Scanner(file).useDelimiter(" *fish  *");
            System.out.println(scanner.nextInt());
            System.out.println(scanner.nextInt());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            scanner.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    private static void printToFile(String directory){
        try {
            FileWriter fw = new FileWriter(directory+"output", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter printWriter = new PrintWriter(bw);
//            File file = new File(directory+"output");
//            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("TEST OUTPUT");
            printWriter.println("LINE TWO");
            printWriter.append("THIS IS A TEST ");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

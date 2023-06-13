/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package File;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author laitu
 */
public class FileController{
    protected FileWriter fileWriter;
    protected BufferedWriter bufferedWriter;
    protected PrintWriter printWriter;
    protected Scanner sc;
    
    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void closeFileAfterWrite () {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void openFileToRead (String fileName) {
        try {
            sc = new Scanner(Paths.get(fileName));
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void closeFileAfterRead () {
            sc.close();
    }  
}

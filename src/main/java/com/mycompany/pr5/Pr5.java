package com.mycompany.pr5;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Pr5 {

    public static void main(String[] args) {
System.out.println("RIBO-04-21 v4 Romanov I.V.");
        Scanner scan = new Scanner(System.in);
        System.out.print("path = ");
        String aj = scan.nextLine();
        
        
        File currentDir = new File(aj);
            displayAllFilesDirectories(currentDir);

        }
        public static void displayAllFilesDirectories(File dir) {
            try {
                File[] files = dir.listFiles();
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("directory: " + file.getCanonicalPath());
            } else {
                        System.out.println("     file: " + file.getCanonicalPath() + ", file size byte: "
                    + file.length());

                            }
                        }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
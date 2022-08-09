package Exception.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppFinaly { 
    public static void main(String[] args) {
        
        File file = new File("C:\\temp\\awerjgio.txt");
        //o scanner tb serve para abrir arquivo. 
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            //percorrer as linhas do arquivo
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error openingfile: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
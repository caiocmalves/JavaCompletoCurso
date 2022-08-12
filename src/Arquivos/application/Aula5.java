package Arquivos.application;

import java.io.File;
import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        //manipulando pastas com file

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        //a variável do tipo file, pode ser tanto o caminho de um arquivo, quanto um caminho de uma pasta
        File path = new File(strPath);

        //cria um vetor de files, contendo o caminho de cada pasta do caminho digitado.
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //só os arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        //criar uma subpasta a partir de uma pasta
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucess) ;

        sc.close();
    }
    
}

package Arquivos.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\015056631\\Documents\\MeusProjetos\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        //o sc.close tem que ser no finally, porque pode dar erro no processo de leitura ou abertura do arquivo, logo, o programa será encerrado e o scanner não vai ser fechado.
        finally {
            //Se der erro de instanciar o scanner, vai dar erro ao fecha-lo, por isso o if. 
            if (sc != null){
                sc.close();
            }
        }
    }
}

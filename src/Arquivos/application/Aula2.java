package Arquivos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula2 {
    public static void main(String[] args) {
        
        //implementação básica padrão feita manualmente
        String path = "C:\\Users\\015056631\\Documents\\MeusProjetos\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //instanciando o bufferdreader no filereader deixa a leitura do arquivo mais rápida e flexível
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e ) {
                e.printStackTrace();
            }
        }
    }
}

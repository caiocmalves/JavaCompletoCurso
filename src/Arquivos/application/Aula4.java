package Arquivos.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula4 {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good morning", "Good Afternoon", "Good night"};

        String path = "C:\\Users\\015056631\\Documents\\MeusProjetos\\out.txt";

        //se rodar novamente o programa, vai recriar o arquivo, para acrescentar no arquivo já criado, basta usar dentro do FileWriter(path, true)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

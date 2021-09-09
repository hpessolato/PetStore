package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

public class Data {

   // Função para ler arquivo JSON
    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

    // Função para ler arquivo CSV
    public Collection<String[]> LerCsv(String caminhoCsv){



        return null;
    }

}

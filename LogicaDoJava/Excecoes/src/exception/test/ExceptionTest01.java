package exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");

        try {
            file.createNewFile();
            System.out.println("Arquivo criado com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
